
/**
 * @(#)vetor_11.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @22/05/2024
 */
import java.util.Arrays;

public class vetor_11 {

    public static void main(String[] args) {
        int numeros1[] = new int[10];
        int numeros2[] = new int[numeros1.length];
        int numeros3[] = new int[numeros1.length + numeros2.length];
        for (int i = 0; i < numeros1.length; i++) {
            numeros1[i] = (int) (Math.random() * 100);
            numeros2[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numeros1) + " + " + Arrays.toString(numeros2));
        for (int i = 0, j = 0; i < numeros3.length; i++, j++) {
            if (i < numeros1.length && j < numeros1.length) {
                numeros3[i] = numeros1[j];
                if (j >= numeros1.length - 1) {
                    j = -1;
                }
            } else if (i >= numeros1.length) {
                numeros3[i] = numeros2[j];
            }
        }
        System.out.println("O resultado da união dos arrays é:\n" + Arrays.toString(numeros3));
    }
}
