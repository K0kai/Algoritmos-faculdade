/**
 * @(#)repeticao_10.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @10/05/2024
 */

import java.util.Scanner;

public class repeticao_10 {
    public static void main(String[] args){
        int numeros[] = new int[5];
        int qntdPar = 0 , qntdImpar = 0, somaPar = 0, somaImpar = 0;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite 5 numeros inteiros:");
            for (int i = 0; i < numeros.length; i++){
                numeros[i] = entrada.nextInt();
                if (numeros[i] % 2 == 0 && numeros[i] != 0){
                    qntdPar++;
                    somaPar = somaPar + numeros[i];
                }
                else if(numeros[i] % 2 != 0 && numeros[i] != 0){
                    qntdImpar++;
                    somaImpar = somaImpar + numeros[i];
                }
                else{
                    System.out.println("O numero não pode ser zero");
                    i--;
                }
            }
            System.out.printf("A quantidade de numeros pares é %d\nA quantidade de numeros impares é %d\nA soma de todos os valores pares é %d\nA soma de todos os valores impares é %d", qntdPar, qntdImpar, somaPar, somaImpar);
        }
    }
    
}
