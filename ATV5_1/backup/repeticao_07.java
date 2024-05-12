/**
 * @(#)repeticao_07.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @10/05/2024
 */

import java.util.ArrayList;

public class repeticao_07 {

    public static void main(String[] args) {
        int[] numeros = new int[500];
        int soma = 0;
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0 && numeros[i] % 3 == 0) {
                soma = soma + numeros[i];
                impares.add(numeros[i]);
            }
        }

        System.out.printf("A soma de todos os numeros inteiros e impares até o 500 e multiplos de 3 é: %d\nE a quantidade desses numeros presentes é: %d", soma, impares.size());
    }
}