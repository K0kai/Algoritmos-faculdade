import java.util.Scanner;

public class q08 {
    public static void main(String[] args){
        double acresc,porcentagem,decresc,prestacao;
        int valorfinal;
        porcentagem = 0.15;
        Scanner dados = new Scanner(System.in);
        System.out.println("Informe o valor da prestação: ");
        prestacao = dados.nextDouble();
        acresc = prestacao + (prestacao * porcentagem);
        decresc = acresc  - (acresc * porcentagem);
        valorfinal = (int) Math.round(prestacao - decresc);
        System.out.println("O prejuizo do comerciante foi de: " + "R$" + valorfinal);
        dados.close();
        System.exit(0);
        

    }
}
