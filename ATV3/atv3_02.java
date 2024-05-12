import java.util.Scanner;

public class atv3_02 {
    public static void main(String[] args){
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um numero inteiro qualquer: ");
        numero = entrada.nextInt();
        if (numero > 0){
            System.out.println("O numero é positivo");
        
        } 
        else if (numero < 0){
            System.out.println("O numero é negativo");

    } else{
        System.out.println("O numero é neutro");
    }
    entrada.close();

}
}
