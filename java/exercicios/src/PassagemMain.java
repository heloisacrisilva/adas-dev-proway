import modelos.Passagens.ListaPassagens;

import java.util.Scanner;

public class PassagemMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaPassagens gerenciador = new ListaPassagens();
        int opcao = 0;

        gerenciador.cadastrarPassagem(1, "São Paulo", "Rio de Janeiro", 250.00);
        gerenciador.cadastrarPassagem(2, "Curitiba", "Florianópolis", 180.50);
        gerenciador.cadastrarPassagem(3, "Belo Horizonte", "Salvador", 450.00);

        do {
            System.out.println("\n=== SISTEMA DE GESTÃO DE PASSAGENS ===");
            System.out.println("1. Cadastrar nova passagem");
            System.out.println("2. Listar todas as passagens");
            System.out.println("3. Listar passagens disponíveis");
            System.out.println("4. Listar passagens compradas");
            System.out.println("5. Comprar passagem");
            System.out.println("6. Cancelar compra de passagem");
            System.out.println("7. Editar dados de uma passagem");
            System.out.println("8. Remover passagem");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Por favor, digite um número válido.");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código da passagem: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite a origem: ");
                    String origem = scanner.nextLine();
                    System.out.print("Digite o destino: ");
                    String destino = scanner.nextLine();
                    System.out.print("Digite o preço (ex: 150.00): ");
                    double preco = scanner.nextDouble();

                    gerenciador.cadastrarPassagem(codigo, origem, destino, preco);
                    System.out.println("Passagem cadastrada com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- TODAS AS PASSAGENS ---");
                    gerenciador.listarPassagens();
                    break;

                case 3:
                    System.out.println("\n--- PASSAGENS DISPONÍVEIS ---");
                    gerenciador.listarPassagensDisponiveis();
                    break;

                case 4:
                    System.out.println("\n--- PASSAGENS COMPRADAS ---");
                    gerenciador.listarPassagensCompradas();
                    break;

                case 5:
                    System.out.print("Digite o código da passagem que deseja comprar: ");
                    int codCompra = scanner.nextInt();
                    gerenciador.comprarPassagem(codCompra);
                    break;

                case 6:
                    System.out.print("Digite o código da passagem para cancelar a compra: ");
                    int codCancela = scanner.nextInt();
                    gerenciador.cancelarPassagem(codCancela);
                    break;

                case 7:
                    System.out.print("Digite o código da passagem que deseja editar: ");
                    int codEdita = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nova origem: ");
                    String novaOrigem = scanner.nextLine();
                    System.out.print("Novo destino: ");
                    String novoDestino = scanner.nextLine();
                    System.out.print("Novo preço: ");
                    double novoPreco = scanner.nextDouble();

                    gerenciador.editarDados(codEdita, novaOrigem, novoDestino, novoPreco);
                    break;

                case 8:
                    System.out.print("Digite o código da passagem que deseja remover: ");
                    int codRemove = scanner.nextInt();
                    gerenciador.removerPassagem(codRemove);
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}
