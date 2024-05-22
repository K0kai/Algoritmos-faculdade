
/**
 * @(#)vetor_16.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @22/05/2024
 */
import java.util.Scanner;

public class vetor_16 {

    public static void main(String[] args) {
        final int TAMANHO = 20;
        double[] vetor1 = new double[TAMANHO];
        double[] vetor2 = new double[TAMANHO];
        double[] resultado = new double[TAMANHO];

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Preencha o primeiro vetor:");
            for (int i = 0; i < TAMANHO; i++) {
                System.out.print("Posição " + (i + 1) + ": ");
                vetor1[i] = scanner.nextDouble();
            }

            System.out.println("Preencha o segundo vetor:");
            for (int i = 0; i < TAMANHO; i++) {
                System.out.print("Posição " + (i + 1) + ": ");
                vetor2[i] = scanner.nextDouble();
            }

            double[] produtos = new double[TAMANHO];
            for (int i = 0; i < TAMANHO; i++) {
                if (vetor2[i] != 0) {
                    produtos[i] = vetor1[i] / vetor2[i];
                } else {
                    produtos[i] = 0;
                }
            }

            int centro = TAMANHO / 2;
            int esquerda = centro - 1;
            int direita = centro;

            for (int i = 0; i < TAMANHO; i++) {
                if (i % 2 == 0) {
                    resultado[direita] = produtos[i];
                    direita++;
                } else {
                    resultado[esquerda] = produtos[i];
                    esquerda--;
                }
            }

            System.out.println("Vetor resultado:");
            for (int i = 0; i < TAMANHO; i++) {
                System.out.println("Posição " + (i + 1) + ": " + resultado[i]);
            }
        }
    }
}
