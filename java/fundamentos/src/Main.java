import java.util.Scanner;

public class Main {

    //Função principal, ou função pela qual a IDE executa o projeto
    public static void main(String[] args) {


        //Comando de saída de dados
        System.out.println("Olá Adas Dev!");

        //Comando de entrada de dados
        Scanner leitor = new Scanner(System.in);

        //Declarar variáveis
        String aluno = "Heloisa";
        int codigo = 1;
        double media = 8.9;
        boolean alunoAprovado = true;

        //Exemplo recebendo valores do usuário
        System.out.println("Olá, me diga qual seu nome: ");
        String nome = leitor.next(); //para texto

        //Exemplo de concatenação de dados
        System.out.println("Seja bem vindo ao sistema " + nome);

        //Condicional IF
        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();

        if (idade >= 18) {
            System.out.println("Legal! Você já é maior de idade.");
        } else {
            System.out.println("Oops! Ainda menor de idade...");
        }

        //Repetição FOR
        for (int count = 1; count <= idade; count++) {
            System.out.println(count);
        }
    }
}