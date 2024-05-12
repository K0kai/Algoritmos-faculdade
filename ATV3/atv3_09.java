import java.util.Scanner;

public class atv3_09 {
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        String input;
        String[] valores;
        System.out.println("Digite dois numeros inteiros separados por virgula:");
        input = dados.nextLine();
        valores = input.trim().split("\\s*,\\s*");
        int valor1,valor2;
        valor1 = Integer.parseInt(valores[0]);
        valor2 = Integer.parseInt(valores[1]);
        if ((valor1 + valor2) > 10){
            System.out.printf("O resultado da soma terá um valor acima de 10, sendo ele: %d", (valor1 + valor2));
        }
        dados.close();
    }
}
