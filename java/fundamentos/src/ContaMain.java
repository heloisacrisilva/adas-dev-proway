import modelos.Conta;

import java.util.Scanner;

public class ContaMain {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Conta conta1 = new Conta("11634123921", 10901, 189);

        String menu = "" +
                "\n------------------------------------------" +
                "\n                ADAS  BANK               " +
                "\n[1] Exibir saldo" +
                "\n[2] Depositar" +
                "\n[3] Sacar" +
                "\n[0] Sair" +
                "\n------------------------------------------" +
                "\nEscolha uma das opções acima: ";

        int opcaoMenu;

        do {
            System.out.print(menu);
            opcaoMenu = leitor.nextInt();

            switch (opcaoMenu) {
                case 1:
                    conta1.exibirSaldo();
                    break;
                case 2:
                    System.out.print("\nQual valor deseja depositar? R$");
                    double valorDepos = leitor.nextDouble();
                    conta1.depositar(valorDepos);
                    break;
                case 3:
                    System.out.print("\nQual valor deseja sacar? R$");
                    double valorSaq = leitor.nextDouble();
                    conta1.sacar(valorSaq);
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcaoMenu != 0);
    }

}
