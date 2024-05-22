
/**
 * @(#)vetor_10.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @20/05/2024
 */
import java.util.Arrays;

public class vetor_10 {

    public static void main(String[] args) {
        int numeros1[] = new int[10];
        int numeros2[] = new int[numeros1.length];
        int numeros3[] = new int[numeros1.length];
        for (int i = 0; i < numeros1.length; i++) {
            numeros1[i] = (int) (Math.random() * 100);
            numeros2[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numeros1) + " + " + Arrays.toString(numeros2));
        for (int i = 0; i < numeros3.length; i++) {
            numeros3[i] = numeros1[i] + numeros2[i];
        }
        System.out.println("Os numeros resultantes são:\n" + Arrays.toString(numeros3));
    }
}
