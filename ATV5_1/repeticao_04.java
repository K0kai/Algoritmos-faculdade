/**
 * @(#)repeticao_04.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @08/05/2024
 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class repeticao_04 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero, acumulador = 0, contador = 0;
        boolean terminado = false;
        System.out.println("Insira numeros pares que serão acumulados até você digitar zero");    
        while (terminado == false){ // loop while que durará enquanto o booleano terminado for falso
            try {
                numero = entrada.nextInt();
                entrada.nextLine();
                if (numero % 2 == 0 && numero != 0){ // checando se o numero é par e diferente de 0
                    acumulador = acumulador + numero;
                    ++contador;
                }
                else if (numero % 2 > 0 && numero != 0){ // checando se o numero é impar e diferente de 0
                }
                else if(numero == 0){ // checa se o numero é igual a 0 e encerra o loop while
                    terminado = true;
                    break;
                }
            }
            catch (InputMismatchException e) { // aqui capturamos uma exceção caso ocorra do valor digitado não ser um inteiro
                System.out.println("Isso não é um numero inteiro");
                entrada.nextLine();
            }      
        }
        int media = acumulador / contador; // criamos uma variável media e já atribuimos o calculo
        System.out.printf("A media aritmetica é %d ", media);
        entrada.close();
    }
    
}
