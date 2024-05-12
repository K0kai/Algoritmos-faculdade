
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
        ArrayList<Integer> impares = new ArrayList<>(); // cria uma lista de array do tipo inteiro para armazenar os numeros impares, a decisão de criar uma lista invés de um array padrão foi ao fato da lista ser adaptável, ótimo para os casos onde você não tem certeza do tamanho do array que vai precisar

        for (int i = 0; i < numeros.length; i++) { // loop for rodando até o comprimento do array
            numeros[i] = i + 1;
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0 && numeros[i] % 3 == 0) {
                soma = soma + numeros[i];
                impares.add(numeros[i]); // adicionando os numeros impares a nossa lista de array
            }
        }

        System.out.printf("A soma de todos os numeros inteiros e impares até o 500 e multiplos de 3 é: %d\nE a quantidade desses numeros presentes é: %d", soma, impares.size());
    }
}
