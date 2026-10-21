import modelos.Livro;

import java.util.Scanner;

public class LivroMain {
    public static void main(String[] args) {
        Livro livro1 = new Livro(109, "Verity", 69.90, 5, true);

        Scanner leitor = new Scanner(System.in);

        String menu = "" +
                "\n------------------------------------------" +
                "\n                Ada's  Library               " +
                "\n[1] Exibir dados" +
                "\n[2] Comprar" +
                "\n[3] Vender" +
                "\n[0] Sair" +
                "\n------------------------------------------" +
                "\nEscolha uma das opções acima: ";

        int opcaoMenu;

        do {
            System.out.print(menu);
            opcaoMenu = leitor.nextInt();

            switch (opcaoMenu) {
                case 1:
                    livro1.exibirSDados();
                    break;
                case 2:
                    System.out.print("\nQuantos livros deseja comprar? ");
                    int qtdeCompra = leitor.nextInt();
                    livro1.comprar(qtdeCompra);
                    break;
                case 3:
                    System.out.print("\nQuantos livros deseja vender? ");
                    int qtdeVenda = leitor.nextInt();
                    livro1.comprar(qtdeVenda);
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
