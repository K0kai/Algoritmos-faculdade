import java.util.Scanner;

public class atv3_06 {
    public static void main(String[] args){
        byte idade;
        Scanner dados = new Scanner(System.in);
        System.out.println("Informe a idade do atleta");
        idade = dados.nextByte();
        if (idade >= 5 && idade <= 12){
            System.out.println("Sua categoria é Infantil");
        }
        else if (idade >= 13 && idade <= 17){
            System.out.println("Sua categoria é Juvenil");
        }
        else if (idade >= 18 && idade <= 25){
            System.out.println("Sua categoria é Profissional");
        }
        else System.out.println("Você está fora da faixa");
        dados.close();
    }
}
