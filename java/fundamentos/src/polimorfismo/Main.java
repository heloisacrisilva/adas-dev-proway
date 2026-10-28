package polimorfismo;

public class Main {
    public static void main(String[] args) {


        CartaoBasico nubankRoxinho = new CartaoBasico(2182, "Nubank", "Mastercard", 0, 120 );

        double valorCompra = 17;

        nubankRoxinho.comprar("Crédito", valorCompra);
//        nubankRoxinho.exibirDados();
//
//        nubankRoxinho.converterMoedas(valorCompra);
//        nubankRoxinho.exibirDados();


        System.out.println("\n\n\n");


        CartaoBlack nubankBlack = new CartaoBlack(0, 0, 23083, "Nubank", "Mastercard",0);

        double valorCompraAlto = 4800;

        nubankBlack.comprar("crédito", valorCompraAlto);

//        nubankBlack.exibirDados();
//        nubankBlack.acumularMilhas(valorCompraAlto);
//        nubankBlack.addCashback(valorCompraAlto);


    }
}
