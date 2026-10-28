package polimorfismo;

public class Cartao {
    private int numero;
    private String banco;
    private String bandeira;
    private boolean bloqueado;
    private double limite;
    private double faturaAtual;

    public Cartao() {
    }

    public Cartao(int numero, String banco, String bandeira, double faturaAtual) {
        this.numero = numero;
        this.banco = banco;
        this.bandeira = bandeira;
        this.bloqueado = false;
        this.limite = 2000;
        this.faturaAtual = faturaAtual;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getFaturaAtual() {
        return faturaAtual;
    }

    public void setFaturaAtual(double faturaAtual) {
        this.faturaAtual = faturaAtual;
    }

    public void comprar(String metodoPagamento, double valor) {
        if (!this.bloqueado) {
            if (valor > 0 && metodoPagamento.equals("Crédito" )) {
                if (this.limite >= valor) {
                    this.limite -= valor;
                    this.faturaAtual += valor;
                    System.out.println("Compra de R$ " + valor + "realizada com sucesso!");
                } else {
                    System.out.println("Limite insuficiente para realizar a compra.");
                }
            } else {
                System.out.println("Dados de compra inválidos (valor menor/igual a zero ou método incorreto).");
            }
        } else {
            System.out.println("Operação negada. O cadastro/cartão está bloqueado.");
        }
    }

    public void exibirDados() {
        System.out.println("----- Dados ddo Cartão -----");
        System.out.println("Número: " + this.numero);
        System.out.println("Bandeira: " + this.bandeira);
        System.out.println("Banco: " + this.banco);
        System.out.println("Limite: R$" + this.limite);
        System.out.println("Fatura atual: R$" + this.faturaAtual);
        System.out.println("Bloqueado?: " + this.bloqueado);
        System.out.println("--------------------------------");
    }

    public void bloquearOuDesbloquearCartao() {
        if (this.isBloqueado()) {
            this.bloqueado = false;
            System.out.println("Cartão desbloqueado com sucesso!");
        } else {
            this.bloqueado = true;
            System.out.println("Cartão bloqueado com sucesso!");
        }
    }


}
