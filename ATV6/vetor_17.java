
/**
 * @(#)vetor_17.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @22/05/2024
 */
import java.util.Scanner;

public class vetor_17 {

    public static void main(String[] args) {
        int tamanho = 20;
        int[] vetor = new int[tamanho];

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite 20 números inteiros:");
            for (int i = 0; i < tamanho; i++) {
                vetor[i] = scanner.nextInt();
            }

            int contagemPares = 0;
            for (int i = 0; i < tamanho; i++) {
                if (vetor[i] % 2 == 0) {
                    contagemPares++;
                }
            }

            System.out.println("Quantidade de valores pares no vetor: " + contagemPares);
        }
    }
}
