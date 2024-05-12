import java.util.Scanner;

public class q06 {
    public static void main(String[] args){
    double porcDistrib, imposto, custoFabrica, custoConsum;
    Scanner dados = new Scanner(System.in);
    porcDistrib = 0.12; // em porcentagem
    imposto = 0.45; // em porcentagem
    System.out.println("Informe o preço de fabrica do carro: ");
    custoFabrica = dados.nextDouble();
    custoConsum = custoFabrica + (custoFabrica * imposto) + (custoFabrica * porcDistrib);
    System.out.println("O custo do consumidor será: " + custoConsum);
    dados.close();
    System.exit(0);

    
    }

    
}
