import java.util.Scanner;

public class ExercSequenciaImpressao {
    /*
    Imprimir uma sequencia de números seguindo as regras abaixo
        - Pedir para o usuário o número final da contagem
        - Imprimir a contagem até o número informado, sendo
        - Se o número for PAR imprimir o dobro do número
        - Se o número for ÍMPAR imprimir a multiplicação do número 3
        - Ao final do laço, imprimir o maior número PAR e o menor número ÍMPAR

     */

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o número até o qual faremos a contagem: ");
        int numero = leitor.nextInt();

        int maiorPar = Integer.MIN_VALUE; // Começa com o menor valor possível
        int menorImpar = Integer.MAX_VALUE; // Começa com o maior valor possível

        for (int count = 1; count <= numero; count++) {
            if (numero % 2 == 0) {
                System.out.println(count * 2);

                if (count > maiorPar) {
                    maiorPar = count;
                }
            } else {
                System.out.println(count * 3);

                if (count < menorImpar) {
                    menorImpar = count;
                }
            }
        }
        System.out.println("\n--- Resultados Finais ---");

        // Validação caso o usuário digite 1 (não haverá números pares na contagem)
        if (maiorPar == Integer.MIN_VALUE) {
            System.out.println("Nenhum número par foi encontrado na contagem.");
        } else {
            System.out.println("Maior número PAR da contagem: " + maiorPar);
        }

        System.out.println("Menor número ÍMPAR da contagem: " + menorImpar);

        leitor.close();

    }

}
