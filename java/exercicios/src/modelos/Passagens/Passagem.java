package modelos.Passagens;

public class Passagem {
    private int codigo;
    private String origem;
    private String destino;
    private double preco;
    private boolean disponivel;

    public Passagem() {
    }

    public Passagem(int codigo, String origem, String destino, double preco, boolean disponivel) {
        this.codigo = codigo;
        this.origem = origem;
        this.destino = destino;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void comprarPassagem(int codigo) {
        this.disponivel = false;
    }

    public void cancelarPassagem(int codigo) {
        this.disponivel = true;
    }

    public void editarDados(String origem, String destino, double preco) {
        this.setOrigem(origem);
        this.setDestino(destino);
        this.setPreco(preco);
    }

}
