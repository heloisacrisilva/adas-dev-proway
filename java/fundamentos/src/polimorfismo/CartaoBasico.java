package polimorfismo;

public class CartaoBasico extends Cartao {
    private double moedasDigitais;

    public CartaoBasico() {
    }

    public CartaoBasico(int numero, String banco, String bandeira, double moedasDigitais, double faturaAtual) {
        super(numero, banco, bandeira, faturaAtual);
        this.moedasDigitais = moedasDigitais;
    }

    public double getMoedasDigitais() {
        return moedasDigitais;
    }

    public void setMoedasDigitais(double moedasDigitais) {
        this.moedasDigitais = moedasDigitais;
    }

    public void converterMoedas(double valor) {
        if (valor >= 100) {
            double valorConvertido = valor * 0.05;
            this.moedasDigitais += valorConvertido;
            System.out.println("Essa compra gerou " + valorConvertido + " moedas digitais!");
        } else {
            System.out.println("Oops! Infelizmente o valor não atinge o mínimo para conversão.");
        }
    }
}
