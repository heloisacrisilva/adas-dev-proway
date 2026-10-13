
import java.util.Scanner;

public class ExercSequenciaImpressao {

    /*
     * Imprimir uma sequência de números seguindo as regras abaixo:
     * - Pedir para o usuário o número final da contagem.
     * - Imprimir a contagem até o número informado, sendo:
     *   - Se o número for PAR, imprimir o dobro do número.
     *   - Se o número for ÍMPAR, imprimir a multiplicação do número por 3.
     * - Ao final do laço, imprimir o maior número PAR e o maior número ÍMPAR.
     */

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número final da contagem: ");
        int numeroFinal = leitor.nextInt();

        int maiorPar = 0;
        int maiorImpar = 0;

        for (int count = 1; count <= numeroFinal; count++) {
            int aux = 0;

            if (count % 2 == 0) {
                aux = count * 2;

                if (aux > maiorPar) {
                    maiorPar = aux;
                }

                System.out.print(aux + " - ");
            } else {
                aux = count * 3;

                if (aux > maiorImpar) {
                    maiorImpar = aux;
                }

                System.out.print(aux + " - ");
            }
        }

        System.out.println("\n--- Resultados Finais ---");
        System.out.println("Maior número PAR da contagem: " + maiorPar);
        System.out.println("Maior número ÍMPAR da contagem: " + maiorImpar);

        leitor.close();
    }
}
