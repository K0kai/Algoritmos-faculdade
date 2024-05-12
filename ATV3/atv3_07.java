import java.util.Scanner;

public class atv3_07 {
    public static void main(String[] args){
        double salarioatual,novosalario;
        double[] reajuste = {0.15,0.10,0.05};
        Scanner dados = new Scanner(System.in);
        System.out.println("Qual é o seu salário?");
        salarioatual = dados.nextDouble();
        if(salarioatual < 500){
            novosalario = salarioatual + (salarioatual * reajuste[0]);
            System.out.printf("Seu salario novo será: R$ %.2f, Porcentagem de reajuste: %.0f%%%n", novosalario, reajuste[0]*100);
        }
        else if(salarioatual >= 500 && salarioatual <= 1000){
            novosalario = salarioatual + (salarioatual * reajuste[1]);
            System.out.printf("Seu salario novo será: R$ %.2f, Porcentagem de reajuste: %.0f%%%n", novosalario, reajuste[1]*100);
        }
        else if(salarioatual > 1000){
            novosalario = salarioatual + (salarioatual * reajuste[2]);
            System.out.printf("Seu salario novo será: R$ %.2f, Porcentagem de reajuste: %.0f%%%n", novosalario, reajuste[2]*100);
        }
        dados.close();

}
    
}
