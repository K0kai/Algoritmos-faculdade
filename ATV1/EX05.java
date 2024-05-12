import java.util.Arrays;
import java.util.Scanner;
class EX05{
    public static void main(String[] args){
        int qntd = 5;
        float[] numero = new float[qntd];
        Scanner entrada;
        entrada = new Scanner(System.in);
        for(int i = 0 ; i <= qntd - 1; i++){
        System.out.println("Digite um numero: ");
        numero[i] = entrada.nextFloat();
        }
        int[] numcon = new int[qntd];
        for(int i = 0 ; i <= qntd - 1; i++){
        numcon[i] = (int) numero[i];
        }
        int soma = Arrays.stream(numcon).sum();
        float media = soma/numcon.length;
        System.out.println(soma);
        System.out.println(media);
        entrada.close();
        System.exit(0);
}
}