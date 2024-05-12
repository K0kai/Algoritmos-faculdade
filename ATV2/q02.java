import java.util.Scanner;
public class q02 {
    public static void main(String[] args){
        double preco;
        int quantidade;
        double resultado;
        Scanner dados = new Scanner(System.in);
        System.out.println("Informe o preço e a quantidade do produto: ");
        preco = dados.nextDouble();
        quantidade =  dados.nextInt();
        resultado = preco * quantidade;
        System.out.println("O preço total será: " + "R$" + resultado);
        dados.close();
        System.exit(0);

    }
    
}
