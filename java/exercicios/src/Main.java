import modelos.Filmes.CatalogoFilmes;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CatalogoFilmes catalogo = new CatalogoFilmes();
        int opcao;

        do {
            System.out.println("\n===== MENU CATÁLOGO DE FILMES =====");
            System.out.println("1. Adicionar Filme");
            System.out.println("2. Listar Todos os Filmes");
            System.out.println("3. Pesquisar Filme por Código");
            System.out.println("4. Pesquisar Filme por Título");
            System.out.println("5. Marcar como Assistido");
            System.out.println("6. Marcar como Não Assistido");
            System.out.println("7. Listar Filmes Assistidos");
            System.out.println("8. Listar Filmes Não Assistidos");
            System.out.println("9. Editar Dados do Filme");
            System.out.println("10. Remover Filme");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código do filme: ");
                    int codAdd = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o título do filme: ");
                    String tituloAdd = scanner.nextLine();
                    System.out.print("Digite o gênero do filme: ");
                    String generoAdd = scanner.nextLine();

                    catalogo.adicionarFilme(codAdd, tituloAdd, generoAdd);
                    System.out.println("Filme adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Filmes ---");
                    catalogo.listarFilmes();
                    break;

                case 3:
                    System.out.print("Digite o código do filme para pesquisar: ");
                    int codPesq = scanner.nextInt();
                    catalogo.pesquisarFilmePorCod(codPesq);
                    break;

                case 4:
                    System.out.print("Digite o título do filme para pesquisar: ");
                    String tituloPesq = scanner.nextLine();
                    catalogo.pesquisarFilmePorTitulo(tituloPesq);
                    break;

                case 5:
                    System.out.print("Digite o código do filme para marcar como ASSISTIDO: ");
                    int codAssistido = scanner.nextInt();
                    catalogo.marcarAssistido(codAssistido);
                    System.out.println("Status atualizado!");
                    break;

                case 6:
                    System.out.print("Digite o código do filme para marcar como NÃO ASSISTIDO: ");
                    int codNaoAssistido = scanner.nextInt();
                    catalogo.marcarNaoAssistido(codNaoAssistido);
                    System.out.println("Status atualizado!");
                    break;

                case 7:
                    System.out.println("\n--- Filmes Assistidos ---");
                    catalogo.listarFilmesAssistidos();
                    break;

                case 8:
                    System.out.println("\n--- Filmes Não Assistidos ---");
                    catalogo.listarFilmesNaoAssistidos();
                    break;

                case 9:
                    System.out.print("Digite o código do filme que deseja editar: ");
                    int codEditar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o NOVO título: ");
                    String novoTitulo = scanner.nextLine();
                    System.out.print("Digite o NOVO gênero: ");
                    String novoGenero = scanner.nextLine();

                    catalogo.editarDados(codEditar, novoTitulo, novoGenero);
                    System.out.println("Dados alterados com sucesso!");
                    break;

                case 10:
                    System.out.print("Digite o código do filme que deseja REMOVER: ");
                    int codRemover = scanner.nextInt();
                    catalogo.removerFilme(codRemover);
                    System.out.println("Remoção concluída!");
                    break;

                case 0:
                    System.out.println("Saindo do sistema... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}