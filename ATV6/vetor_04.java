
/**
 * @(#)vetor_04.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @20/05/2024
 */
import java.util.Arrays;
import java.util.Scanner;

public class vetor_04 {

    public static void main(String[] args) {
        int inteiros[] = new int[5];
        int inteiros2[] = new int[inteiros.length];
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Insira os numeros inteiros");
            for (int i = 0; i < inteiros.length; i++) {
                inteiros[i] = entrada.nextInt();
                entrada.nextLine();
            }
            for (int i = 0; i < inteiros2.length; i++) {
                inteiros2[i] = inteiros[i] + 2;
            }
        }
        System.out.println(Arrays.toString(inteiros));
        System.out.println(Arrays.toString(inteiros2));

    }

}
