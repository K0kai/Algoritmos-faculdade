
/**
 * @(#)vetor_02.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @20/05/2024
 */
import java.util.Arrays;
import java.util.Scanner;

public class vetor_02 {

    public static void main(String[] args) {
        int inteiros[] = new int[5];
        int soma = 0;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Insira 5 numeros inteiros");
            for (int i = 0; i < inteiros.length; i++) {
                inteiros[i] = entrada.nextInt();
                soma = soma + inteiros[i];
                entrada.nextLine();
            }
        }
        System.out.println(Arrays.toString(inteiros));
        System.out.println("Soma: " + soma);

    }

}
