/**
 * @(#)repeticao_05.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @08/05/2024
 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class repeticao_05 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero = 30, numaleatorio = 0, tentativas = 0; // inicializamos as variáveis onde numero é o numero que tentaremos adivinhar, numaleatorio o numero de entrada, e tentativas será a quantidade de tentativas até o final
        while(numaleatorio != numero){ // enquanto o numero que digitarmos for diferente do numero que temos que adivinhar, o bloco while irá rodar
            try {
                System.out.println("Tente adivinhar o numero");
                numaleatorio = entrada.nextInt();
                entrada.nextLine(); // limpando o scanner após atribuirmos o valor
                ++tentativas; // incrementando o numero de tentativas, isso irá somar + 1 ao valor, se tentativas for 0 após o incremento ele irá virar 1, se ele for 1 ele vai virar 2, e assim em diante
            if (numero - numaleatorio > 0 && numero - numaleatorio > 10){ // checa se o resultado da diferença e se está longe do numero adivinhado
                System.out.println("Longe");
            }
            else if (numero - numaleatorio > 0 && numero - numaleatorio <= 10){ // checa se o resultado da diferença é positivo e esta perto do numero adivinhado
                System.out.println("Perto");
            }
            else if (numero - numaleatorio < 0 && numero  - numaleatorio * -1 > 10){ // checa se o resultado da diferença é negativo
                System.out.println("Longe");
            }
            else if (numero - numaleatorio < 0 && numero  - numaleatorio * -1 < 10){ // checa se o resultado da diferença é negativo
                System.out.println("Perto");
            }
            }
            catch (InputMismatchException e) { // capturamos uma exceção caso ocorra do valor digitado não ser um numero inteiro
                System.out.println("Isso não é um numero inteiro");
                entrada.nextLine();
            }
            
        }
        System.out.printf("O numero é %d e você acertou em %d tentativas", numero, tentativas);
        entrada.close();
    }
}
