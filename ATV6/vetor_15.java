
/**
 * @(#)vetor_15.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @22/05/2024
 */
import java.util.Scanner;

public class vetor_15 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            final int TAMANHO = 20;
            double[] vetor1 = new double[TAMANHO];
            double[] vetor2 = new double[TAMANHO];
            double[] resultado = new double[TAMANHO];

            System.out.println("Digite os valores para o primeiro vetor:");
            for (int i = 0; i < TAMANHO; i++) {
                System.out.print("Vetor1[" + i + "]: ");
                vetor1[i] = scanner.nextDouble();
            }

            System.out.println("Digite os valores para o segundo vetor:");
            for (int i = 0; i < TAMANHO; i++) {
                System.out.print("Vetor2[" + i + "]: ");
                vetor2[i] = scanner.nextDouble();
                while (vetor2[i] == 0) {
                    System.out.println("O valor não pode ser zero. Digite novamente:");
                    System.out.print("Vetor2[" + i + "]: ");
                    vetor2[i] = scanner.nextDouble();
                }
            }

            for (int i = 0; i < TAMANHO; i++) {
                resultado[i] = vetor1[i] * (1 / vetor2[i]);
            }

            System.out.println("Resultado da multiplicação do primeiro vetor pelo inverso do segundo vetor:");
            for (int i = 0; i < TAMANHO; i++) {
                System.out.println("Resultado[" + i + "] = " + resultado[i]);
            }
        }
    }
}
