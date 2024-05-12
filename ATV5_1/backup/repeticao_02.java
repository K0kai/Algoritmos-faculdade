/**
 * @(#)repeticao_05.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @08/05/2024
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class repeticao_02 {
    public static void main(String[] args){
        try (Scanner entrada = new Scanner(System.in)) {
            char sexo;
            double altura, soma, porcento;
            int sexoM, sexoF;
            int numpessoas = 50; //essa variável pode ser alterada para ajustar o numero de pessoas que quer
            sexoM = 0;
            sexoF= 0;
            ArrayList<Double> alturaM = new ArrayList<>(); //ArrayList ou lista de vetor é diferente de um array/vetor padrão, vetores vem em tamanhos fixos, arraylist é não possui tamanho fixo
            ArrayList<Double> alturaF = new ArrayList<>();
            for (int i = 0; i < numpessoas; i++){
                System.out.println("Digite \"M\" caso seja homem e \"F\" caso seja mulher\n");
                sexo = entrada.next().charAt(0); // Verifica a primeira letra presente na string, o resultado é um dado do tipo char
                if (sexo == 'M' || sexo == 'm'){
                    sexoM = sexoM + 1;
                    System.out.println("Digite sua altura\n");
                    altura = Double.parseDouble(entrada.next().replace(",",".")); // converte a string para double e substitui , por . caso o usuario tenha inserido dessa forma
                    alturaM.add(altura); // adiciona a altura para o arraylist, neste caso como não tinha nenhum valor no arraylist, este é o primeiro valor, que no caso de um array comum seria definido como 0 ([0], [1], [2])
                    altura = 0;
                }
                else if (sexo == 'F' || sexo == 'f'){
                    sexoF = sexoF + 1;
                    System.out.println("Digite sua altura\n");
                    altura = Double.parseDouble(entrada.next().replace(",","."));
                    alturaF.add(altura);
                    altura = 0;
                }
            }   soma = 0;
            for (int i = 0; i < alturaF.size(); i++){ // a função .size() do arraylist funciona basicamente da mesma maneira que o .length de um array comum, este loop roda até o tamanho maximo do arraylist
                soma = soma + alturaF.get(i);  // soma todos os valores presentes na lista
            }   if (alturaF.isEmpty()){ // checa se a lista está vazia, se sim adiciona um valor 0 para ela, o motivo para isso é porque nesse codigo estamos utlizando a biblioteca collections para ver valores minimos e maximos, que não permite valores nulos 
                alturaF.add(0.0);
            }
            else if (alturaM.isEmpty()){
                alturaM.add(0.0);
            }   porcento = (double) sexoM / numpessoas * 100;
            System.out.printf("A maior altura dos homens é %.2f e a menor é %.2f\nA maior altura das mulheres é %.2f e a menor é %.2f\nA media da altura das mulheres é %.2f\nO numero de homens é %d, e o porcentual é %.1f%% ", Collections.max(alturaM), Collections.min(alturaM), Collections.max(alturaF), Collections.min(alturaF), (soma/alturaF.size()), sexoM, porcento);
        }
    }
    
}
