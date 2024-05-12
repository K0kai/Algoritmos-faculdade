import java.util.Scanner;

public class q04 {
    public static void main(String[] args){
    double tempc,tempf;
    Scanner dados = new Scanner(System.in);
    System.out.println("Informe a temperatura em Celsius para ser convertida: ");
    tempc = dados.nextDouble();
    tempf = ((tempc * 9/5) + 32);
    System.out.println("A temperatura em Fahrenheit é: " + tempf);
    dados.close();
    System.exit(0);
    }

}
