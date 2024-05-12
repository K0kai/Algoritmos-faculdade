import java.util.Scanner;

class EX02 {
    public static void main(String[] args){
    int idade;
    String altura;
    Scanner entrada;
    entrada = new Scanner(System.in);
    System.out.println("Digite a sua idade: ");
    idade = entrada.nextInt();
    System.out.println("Digite a sua altura: ");
    altura = entrada.next();
    System.out.println("A sua idade é " + idade + " e a sua altura é " + altura);
    entrada.close();
    System.exit(0);
    
    }
}