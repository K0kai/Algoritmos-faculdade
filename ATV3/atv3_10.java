import java.util.Scanner;

public class atv3_10 {
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        byte idade;
        System.out.println("Informe a idade");
        idade = dados.nextByte();
        if (idade < 18){
            System.out.println("Você é menor de idade");
        }
        else if (idade >= 18 && idade < 65){
            System.out.println("Você é maior de idade");
        }
        else if (idade >= 65){
            System.out.println("Você é idoso");
        }
        dados.close();
    }
}
