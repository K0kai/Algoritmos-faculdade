
/**
 * @(#)vetor_09.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @20/05/2024
 */
import java.util.Arrays;
import java.util.Scanner;

public class vetor_09 {

    public static void main(String[] args) {
        int numeros[] = new int[5];
        boolean sair = false;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 1000);
        }
        try (Scanner entrada = new Scanner(System.in)) {
            String ultentrada;
            System.out.println("Adivinhe um numero ou digite \"sair\" para encerrar");
            while (sair == false) {
                ultentrada = entrada.nextLine();
                if (ultentrada.equalsIgnoreCase("sair") == false) {
                    for (int i = 0; i < numeros.length; i++) {
                        if (numeros[i] == Integer.parseInt(ultentrada)) {
                            System.out.printf("Você acertou!, o numero é %d e estava na posição %d ", numeros[i], i);
                            sair = true;
                        }
                    }
                } else {
                    System.out.println("Os numeros eram: " + Arrays.toString(numeros));
                    sair = true;

                }

            }

        }
    }

}
