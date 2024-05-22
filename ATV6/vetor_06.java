
/**
 * @(#)vetor_06.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @20/05/2024
 */
import java.util.Arrays;
import java.util.Scanner;

public class vetor_06 {

    public static void main(String[] args) {
        int inteiros[] = new int[10];
        int inteiros2[] = new int[inteiros.length];
        int inteiros3[] = new int[inteiros.length];
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Insira os 10 numeros inteiros");
            for (int i = 0; i < inteiros.length; i++) {
                inteiros[i] = entrada.nextInt();
                entrada.nextLine();
            }
            System.out.println("Insira mais 10 numeros inteiros");
            for (int i = 0; i < inteiros2.length; i++) {
                inteiros2[i] = entrada.nextInt();
                entrada.nextLine();
            }
            for (int i = inteiros.length - 1, j = 0; i > -1; i--, j++) {
                inteiros3[i] = inteiros[j] + inteiros2[j];
            }
        }
        System.out.println(Arrays.toString(inteiros3));

    }

}
