import java.util.Scanner;
class EX08{
    public static void main(String[] args){
       int num1,num2,num3,soma,produto;
       Scanner entrada;
       entrada = new Scanner(System.in);
       System.out.println("Digite um numero: ");
       num1 = entrada.nextInt();
       System.out.println();
       System.out.println("Digite o segundo numero: ");
       num2 = entrada.nextInt();
       System.out.println();
       System.out.println("Digite o terceiro numero numero: ");
       num3 = entrada.nextInt();
       System.out.println();
       soma = num1+num2+num3;
       produto = num1*num2*num3;
       System.out.println("Soma: " + soma);
       System.out.println();
       System.out.println("Produto " + produto);
       entrada.close();
       System.exit(0);


    }
}