
/**
 * @(#)vetor_14.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @22/05/2024
 */
public class vetor_14 {

    public static void main(String[] args) {
        int[] vetor = new int[100];

        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] = 1;
            } else {
                vetor[i] = 0;
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
