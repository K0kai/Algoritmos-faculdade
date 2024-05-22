
/**
 * @(#)vetor_18.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @22/05/2024
 */
import java.util.Arrays;
import java.util.Scanner;

public class vetor_18 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] vetorOriginal = new int[10];
            int[] vetorOrdenado = new int[10];

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
