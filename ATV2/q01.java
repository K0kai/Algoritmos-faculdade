import java.util.Scanner;

public class q01 {
    public static void main(String[] args){
        double numero,potencia;
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite um numero para ser elevado ao seu quadrado: ");
        numero = dados.nextDouble();
        potencia = Math.pow(numero,2);
        System.out.println("Seu numero é: " + potencia);
        dados.close();
        System.exit(0);



    }
    
}
