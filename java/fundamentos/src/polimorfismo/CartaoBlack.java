package polimorfismo;

public class CartaoBlack extends Cartao {
    private int milhas;
    private double saldoCashback;

    public CartaoBlack() {
    }

    public CartaoBlack(int milhas, double saldoCashback, int numero, String banco, String bandeira, double faturaAtual) {
        super(numero, banco, bandeira, faturaAtual);
        this.milhas = milhas;
        this.saldoCashback = saldoCashback;
    }

    public int getMilhas() {
        return milhas;
    }

    public void setMilhas(int milhas) {
        this.milhas = milhas;
    }

    public double getSaldoCashback() {
        return saldoCashback;
    }

    public void setSaldoCashback(double saldoCashback) {
        this.saldoCashback = saldoCashback;
    }

    public void acumularMilhas(double valor) {
        if (valor > 0) {
            int milhasGanhar = (int) (valor * 2);
            this.milhas += milhasGanhar;

            System.out.println("Milhas acumuladas: " + milhasGanhar);
            System.out.println("Saldo total de milhas: " + this.milhas);
        } else {
            System.out.println("O valor da compra deve ser positivo.");
        }
    }

    public void addCashback(double valor) {
        if (valor >= 30) {
            double cashback = valor * 0.05;
            this.saldoCashback += cashback;

            System.out.println("Cashback concluído com sucesso! R$ " + cashback);
        } else {
            System.out.println("Oops! infelizmente o valor não atinge o mínimo para cashback.");
        }
    }
}
