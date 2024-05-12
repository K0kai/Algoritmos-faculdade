import java.util.Scanner;

public class atv3_03 {
    public static void main(String[] args){
        int numero;
        Scanner dados = new Scanner(System.in);
        System.out.println("Insira um numero inteiro: ");
        numero = dados.nextInt();
        if (numero != 0 && numero % 2 == 0){
            System.out.println("O numero é par");
        } else if (numero != 0 && numero % 2 != 0){
            System.out.println("O numero é impar");
        } else{
            System.out.println("O numero é nulo");
        }
        dados.close();
    }
}
