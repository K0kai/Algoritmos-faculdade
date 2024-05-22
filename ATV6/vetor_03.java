
/**
 * @(#)vetor_03.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @20/05/2024
 */
import java.util.Arrays;
import java.util.Scanner;

public class vetor_03 {

    public static void main(String[] args) {
        int idades[] = new int[6];
        int[] idadesSomadas = new int[idades.length];
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Insira as idades");
            for (int i = 0; i < idades.length; i++) {
                idades[i] = entrada.nextInt();
                entrada.nextLine();
            }

            for (int i = 0; i < idadesSomadas.length; i++) {
                idadesSomadas[i] = idades[i] + 3;
            }
        }
        System.out.println(Arrays.toString(idades));
        System.out.println(Arrays.toString(idadesSomadas));

    }

}
