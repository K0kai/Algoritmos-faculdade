import java.util.Scanner;
class EX10{
    public static void main(String[] args){
       String numero;
       int numconvertido, reverso;
       Scanner entrada;
       entrada = new Scanner(System.in);
       reverso = 0;
       System.out.println("Digite um numero inteiro de 3 digitos");
       numero = entrada.next().substring(0, 3);
       numconvertido = Integer.parseInt(numero);
       while(numconvertido !=0 ){
        int digito = numconvertido % 10;
        reverso = reverso * 10 + digito;
        numconvertido /= 10;
       }
       System.out.println(reverso);
       entrada.close();
       System.exit(0);


    }
}