import java.util.Scanner;

public class atv3_11 {
    public static void main(String[] args){
        double vc,vv;
        double[] lc = {1.70,1.50,1.30};
        Scanner dados = new Scanner(System.in);
        String nome;
        System.out.println("Informe o nome do produto");
        nome = dados.nextLine();
        System.out.println("Informe o valor da compra");
        vc = dados.nextDouble();
        if (vc < 100){
            vv = (vc * lc[0]);
            System.out.printf("O %s foi comprado a %.2f e vendido a %.2f ", nome, vc, vv);
        }
        else if (vc >= 100 && vc <= 200){
            vv = (vc * lc[1]);
            System.out.printf("O %s foi comprado a %.2f e vendido a %.2f ", nome, vc, vv);
        }
        else if (vc > 200){
            vv = (vc * lc[2]);
            System.out.printf("O %s foi comprado a %.2f e vendido a %.2f ", nome, vc, vv);
        }
        dados.close();
    }
}
