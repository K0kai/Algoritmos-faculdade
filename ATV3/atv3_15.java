import java.util.Scanner;

public class atv3_15 {
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        String[] cargos = {"Gerente","Vendedor","Programador","Motorista","Vereador","Deputado"};
        double[] aumento = {0.30,0.40,0.50,0.60,0.0,0.0};
        byte id;
        System.out.println("Digite um id de 1 a 6:");
        id = dados.nextByte();
        switch(id){
            case 1:
            System.out.printf("Você %s terá um aumento de %.0f%% no seu salário", cargos[--id], (aumento[id] * 100));
            break;
            case 2:
            System.out.printf("Você %s terá um aumento de %.0f%% no seu salário", cargos[--id], (aumento[id] * 100));
            break;
            case 3:
            System.out.printf("Você %s terá um aumento de %.0f%% no seu salário", cargos[--id], (aumento[id] * 100));
            break;
            case 4:
            System.out.printf("Você %s terá um aumento de %.0f%% no seu salário", cargos[--id], (aumento[id] * 100));
            break;
            case 5:
            System.out.printf("Você %s terá um aumento de %.0f%% no seu salário", cargos[--id], (aumento[id] * 100));
            break;
            case 6:
            System.out.printf("Você %s terá um aumento de %.0f%% no seu salário", cargos[--id], (aumento[id] * 100));
            break;
            default:
            System.out.println("Id inválido");
            break;
        }
        dados.close();

    }
    
}
