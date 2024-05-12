import java.util.Scanner;

public class atv3_05 {
    public static void main(String[] args){
        int numero;
        Scanner dados = new Scanner(System.in);
        System.out.println("Insira um numero inteiro para ser dividido por 5");
        numero = dados.nextInt();
        if (numero % 5 == 0){
            System.out.println("Esse numero é divisivel por 5");
        }
        else{
            System.out.println("Esse numero não é divisivel por 5");
        }
        dados.close();
    }
}
