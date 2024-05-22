
/**
 * @(#)vetor_13.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @22/05/2024
 */
import java.util.Scanner;

public class vetor_13 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] vetor1 = new int[10];
            int[] vetor2 = new int[10];
            int[] vetorResultado = new int[10];

            System.out.println("Insira valores para o vetor 1:");
            for (int i = 0; i < vetor1.length; i++) {
                vetor1[i] = scanner.nextInt();
            }

            System.out.println("Insira valores para o vetor 2:");
            for (int i = 0; i < vetor2.length; i++) {
                vetor2[i] = scanner.nextInt();
            }

            char[] vetorOperacao = new char[10];
            System.out.println("Insira caracteres de operação (+, -, *, /) para cada par de elementos:");
            for (int i = 0; i < vetorOperacao.length; i++) {
                vetorOperacao[i] = scanner.next().charAt(0);
            }

            for (int i = 0; i < vetorResultado.length; i++) {
                switch (vetorOperacao[i]) {
                    case '+':
                        vetorResultado[i] = vetor1[i] + vetor2[i];
                        break;
                    case '-':
                        vetorResultado[i] = vetor1[i] - vetor2[i];
                        break;
                    case '*':
                        vetorResultado[i] = vetor1[i] * vetor2[i];
                        break;
                    case '/':
                        if (vetor2[i] != 0) {
                            vetorResultado[i] = vetor1[i] / vetor2[i];
                        } else {
                            System.out.println("Division by zero error at index: " + i);
                            vetorResultado[i] = 0;
                        }
                        break;
                    default:
                        System.out.println("Invalid operation character at index: " + i);
                        vetorResultado[i] = 0;
                }
            }

            System.out.println("Result vector:");
            for (int value : vetorResultado) {
                System.out.print(value + " ");
            }
        }
    }
}
