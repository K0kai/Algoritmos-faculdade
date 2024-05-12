import java.util.Scanner;

public class EX01 {
    public static void main(String[] args){
    int idade;
    int _idade;
    Scanner entrada;
    entrada = new Scanner(System.in);
    System.out.println("Informe a idade");
    idade = entrada.nextInt();
    System.out.println("A sua idade é " + idade);
    entrada.close();
    System.exit(0);
    }
}