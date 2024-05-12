
/**
 * @(#)repeticao_10.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @10/05/2024
 */
import java.util.Scanner;

public class repeticao_10 {

    public static void main(String[] args) {
        int numeros[] = new int[5];
        int qntdPar = 0, qntdImpar = 0, somaPar = 0, somaImpar = 0;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite 5 numeros inteiros:");
            for (int i = 0; i < numeros.length; i++) { // cria um loop for de 0 até o comprimento do array numeros, que no caso é 5
                numeros[i] = entrada.nextInt();
                entrada.nextLine(); // limpa o scanner após o .nextInt()
                if (numeros[i] != 0 && numeros[i] % 2 == 0) { // verificando se o numero não é zero e é par
                    qntdPar++;
                    somaPar = somaPar + numeros[i];
                } else if (numeros[i] != 0 && numeros[i] % 2 != 0) { // verificando se o numero não é zero e é impar
                    qntdImpar++;
                    somaImpar = somaImpar + numeros[i];
                } else { // se for zero informa que o numero não pode ser zero
                    System.out.println("O numero não pode ser zero");
                    i--; // subtrai 1 do nosso i para retornar o loop até onde ele estava antes do zero
                }
            }
            System.out.printf("A quantidade de numeros pares é %d\nA quantidade de numeros impares é %d\nA soma de todos os valores pares é %d\nA soma de todos os valores impares é %d", qntdPar, qntdImpar, somaPar, somaImpar);
        }
    }

}
