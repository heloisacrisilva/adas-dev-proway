package modelos.Passagens;

import modelos.Filmes.Filme;

import java.util.ArrayList;
import java.util.List;

public class ListaPassagens {
    private List<Passagem> passagens = new ArrayList<>();

    public ListaPassagens() {
    }

    public ListaPassagens(List<Passagem> passagens) {
        this.passagens = passagens;
    }

    public List<Passagem> getPassagens() {
        return passagens;
    }

    public void setPassagens(List<Passagem> passagens) {
        this.passagens = passagens;
    }

    private void exibirPassagem(Passagem passagem) {
        System.out.println("Código: " + passagem.getCodigo());
        System.out.println("Origem: " + passagem.getOrigem());
        System.out.println("Destino: " + passagem.getDestino());
        System.out.println("Preço: " + passagem.getPreco());
        System.out.println("Disponível?: " + passagem.isDisponivel());
        System.out.println("-------------------");
    }

    private Passagem localizarPassagem(int codigo) {
        for (Passagem passagem : passagens) {
            if (passagem.getCodigo() == codigo) {
                return passagem;
            }
        }

        return null;
    }

    private Passagem localizarPassagemPorDestino(String destino) {
        for (Passagem passagem : passagens) {
            if (passagem.getDestino().equals(destino)) {
                return passagem;
            }
        }

        return null;
    }

    public void cadastrarPassagem(int codigo, String origem, String destino, double preco) {
        Passagem passagem = new Passagem(codigo, origem, destino, preco, true);
        passagens.add(passagem);
    }

    public void listarPassagens() {
        for (Passagem passagem : passagens) {
            exibirPassagem(passagem);
        }
    }

    public void listarPassagensDisponiveis() {
        for (Passagem passagem : passagens) {
            if (passagem.isDisponivel()) {
                exibirPassagem(passagem);
            }
        }
    }

    public void listarPassagensCompradas() {
        for (Passagem passagem : passagens) {
            if (!passagem.isDisponivel()) {
                exibirPassagem(passagem);
            }
        }
    }

    public void comprarPassagem(int codigo) {
        Passagem passagem = localizarPassagem(codigo);

        if (passagem != null && passagem.isDisponivel()) {
           passagem.setDisponivel(false);
           System.out.println("Passagem comprada com sucesso!");
        } else {
            System.out.println("Oops! Passagem inexistente ou insdisponível para compra.");
        }
    }

    public void cancelarPassagem(int codigo) {
        Passagem passagem = localizarPassagem(codigo);

        if (passagem != null && !passagem.isDisponivel()) {
            passagem.setDisponivel(true);
            System.out.println("Passagem cancelada com sucesso!");
        } else {
            System.out.println("Oops! Passagem inexistente ou já foi cancelada.");
        }
    }

    public void editarDados(int codigo, String origem, String destino, double preco) {
        Passagem passagem = localizarPassagem(codigo);

        if (passagem != null) {
            passagem.editarDados(origem, destino, preco);
        } else {
            System.out.println("Oops! Passagem não encontrada.");
        }
    }

    public void removerPassagem(int codigo) {
        boolean removido = passagens.removeIf(
                passagem -> passagem.getCodigo() == codigo && passagem.isDisponivel()
        );

        if (!removido) {
            System.out.println("Oops! Passagem não encontrada.");
        }
    }
}
