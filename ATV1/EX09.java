import java.util.Scanner;
class EX09{
    public static void main(String[] args){
       int num1,num2,resto,divisao;
       Scanner entrada;
       entrada = new Scanner(System.in);
       System.out.println("Digite um numero: ");
       num1 = entrada.nextInt();
       System.out.println();
       System.out.println("Digite um numero: ");
       num2 = entrada.nextInt();
       System.out.println();
       divisao = num1/num2;
       resto = num1%num2;
       System.out.println("Divisao: "+ divisao);
       System.out.println();
       System.out.println("Resto: "+ resto);
       entrada.close();
       System.exit(0);

       


    }
}