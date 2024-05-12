import java.util.Scanner;

public class atv3_08 {
    public static void main(String[] args){
        byte idade;
        String[] classe = {"não eleitor", "eleitor obrigatório", "eleitor facultativo"};
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = dados.nextByte();
        if (idade < 16){
            System.out.printf("Você é um %s, logo não precisa votar", classe[0]);
        }
        else if (idade >=18 && idade < 65){
            System.out.printf("Você é um %s, você é obrigado a votar",classe[1]);
        }
        else if (idade > 15 && idade < 19 || idade > 65){
            System.out.printf("Você é um %s, você tem direito de votar mas não é obrigado",classe[2]);
        }
        dados.close();
    }
    
}
