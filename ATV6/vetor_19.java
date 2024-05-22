
/**
 * @(#)vetor_19.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @22/05/2024
 */
import java.util.Arrays;
import java.util.Scanner;

public class vetor_19 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Integer[] vetorOriginal = new Integer[10];
            Integer[] vetorOrdenado = new Integer[10];

            System.out.println("Insira os numeros para o array:");

            for (int i = 0; i < 10; i++) {
                vetorOriginal[i] = scanner.nextInt();
            }

            System.arraycopy(vetorOriginal, 0, vetorOrdenado, 0, 10);
            Arrays.sort(vetorOrdenado);

            System.out.println("Vetor Original: " + Arrays.toString(vetorOriginal));
            System.out.println("Vetor Ordenado: " + Arrays.toString(vetorOrdenado));
        }
    }
}
