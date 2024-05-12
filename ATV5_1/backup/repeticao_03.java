/**
 * @(#)repeticao_03.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @08/05/2024
 */


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class repeticao_03 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int [] pesos = new int[3]; // inicializa um array de tamanho 3
        pesos[0] = 3;
        pesos[1] = 2;
        pesos[2] = 1; // adiciona os pesos das medalhas ao array, lembrando que o primeiro indice do array é definido como [0] e não [1]
        int [] medalhas = new int[9]; // inicializa outro array de tamanho 9
        int contador;
        String nome1 = "", nome2 = "", nome3 = ""; // inicializando as variaveis
        boolean terminado = false;
        contador = 0; // inicializando esta variável também
        while (terminado == false){ // enquanto o booleano terminado for falso, executa o bloco while
            try { // o bloco try-catch funciona da seguinte maneira, no bloco try ele tentará rodar o codigo que colocar e caso dê algum erro (exceção) ao invés do programa fechar ele rodará o bloco catch, capturando a exceção que você definir
                if (contador < 3){
                    System.out.println("Insira o nome do primeiro país");
                    nome1 = entrada.nextLine();
                    System.out.println("Insira a quantidade de medalhas de ouro");
                    medalhas[contador] = entrada.nextInt();
                    entrada.nextLine(); // após atribuirmos um valor a uma variavel utilizando o nextInt, é bom limparmos o scanner fazendo scanner.nextLine();
                    ++contador;
                    System.out.println("Insira a quantidade de medalhas de prata");
                    medalhas[contador] = entrada.nextInt();
                    entrada.nextLine(); // mesma coisa aqui
                    ++contador;
                    System.out.println("Insira a quantidade de medalhas de bronze");
                    medalhas[contador] = entrada.nextInt();
                    entrada.nextLine();
                    ++contador;
                    System.out.println("\n");             
                }
                else if (contador >= 3 && contador < 6){
                    System.out.println("Insira o nome do segundo país");
                    nome2 = entrada.nextLine();
                    System.out.println("Insira a quantidade de medalhas de ouro");
                    medalhas[contador] = entrada.nextInt();
                    entrada.nextLine();
                    ++contador;
                    System.out.println("Insira a quantidade de medalhas de prata");
                    medalhas[contador] = entrada.nextInt();
                    entrada.nextLine();
                    ++contador;
                    System.out.println("Insira a quantidade de medalhas de bronze");
                    medalhas[contador] = entrada.nextInt();
                    entrada.nextLine();
                    ++contador;
                    System.out.println("\n");
                }
                else if (contador >= 6 && contador < 9){
                    System.out.println("Insira o nome do terceiro país");
                    nome3 = entrada.nextLine();
                    System.out.println("Insira a quantidade de medalhas de ouro");
                    medalhas[contador] = entrada.nextInt();
                    entrada.nextLine();
                    ++contador;
                    System.out.println("Insira a quantidade de medalhas de prata");
                    medalhas[contador] = entrada.nextInt();
                    entrada.nextLine();
                    ++contador;
                    System.out.println("Insira a quantidade de medalhas de bronze");
                    medalhas[contador] = entrada.nextInt();
                    entrada.nextLine();
                    ++contador;
                    terminado = true;            
                }
                
            } catch (InputMismatchException e) { // no nosso caso a exceção que tentamos capturar é a exceção no caso de um valor errado digitado, por exemplo: temos uma variavel de valor inteiro e o usuario digitou uma string 
                System.out.println("Ocorreu um erro, tente novamente");
                entrada.nextLine(); // limpando o scanner
                contador = 0; // resetando o contador
                Arrays.fill(medalhas, 0); // aqui estamos resetando todas as nossas variáveis para uma nova tentativa
            }
        }
            
        
        int class1,class2,class3;
        contador = 0;
        for (int i = 0; i < medalhas.length; i++){ // loop que multiplica as medalhas pelos seus devidos pesos
            medalhas[i] = medalhas[i] * pesos[contador];
            ++contador;
            if (contador == pesos.length){ // como nosso array de pesos é de tamanho 3 e a de medalhas é de tamanho 9, temos que resetar o nosso contador toda vez que ele atingir o limite do array
                contador = 0;
            }
        }
        
        class1 = medalhas[0] + medalhas[1] + medalhas[2];
        class2 = medalhas[3] + medalhas[4] + medalhas[5];
        class3 = medalhas[6] + medalhas[7] + medalhas[8];
        System.out.printf("A classificação do pais %s é %d\nA classificação do pais %s é %d\nA classificação do pais %s é %d",nome1, class1, nome2, class2, nome3, class3);
        entrada.close();


    }
}
