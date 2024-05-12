import java.util.Scanner;

public class atv3_14 {
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        byte mes;
        System.out.println("Digite o numero do mês");
        mes = dados.nextByte();
        switch (mes) {
            case 1:
                System.out.printf("O mês é Janeiro.%nO mês tem 31 dias");
                break;
            case 2:
                System.out.printf("O mês é Fevereiro.%nO mês tem 28/29 dias");
                break;
            case 3:
                System.out.printf("O mês é Março.%nO mês tem 31 dias");
                break;
            case 4:
                System.out.printf("O mês é Abril.%nO mês tem 30 dias");
                break;
            case 5:
                System.out.printf("O mês é Maio.%nO mês tem 31 dias");
                break;
            case 6:
                System.out.printf("O mês é Junho.%nO mês tem 30 dias");
                break;
            case 7:
                System.out.printf("O mês é Julho.%nO mês tem 31 dias");
                break;
            case 8:
                System.out.printf("O mês é Agosto.%nO mês tem 31 dias");
                break;
            case 9:
                System.out.printf("O mês é Setembro.%nO mês tem 30 dias");
                break;
            case 10:
                System.out.printf("O mês é Outubro.%nO mês tem 31 dias");
                break;
            case 11:
                System.out.printf("O mês é Novembro.%nO mês tem 30 dias");
                break;
            case 12:
                System.out.printf("O mês é Dezembro.%nO mês tem 31 dias");
                break;
            default:
                System.out.println("Mês invalido");
                break;
        }
        dados.close();
    
    }
}
