import java.util.Scanner;

public class q03 {
    public static void main(String[] args){
        double area, baseM,basem,altura;
        Scanner dados = new Scanner(System.in);
        System.out.println("Informe os dados da base maior, base menor e a altura do trapézio: ");
        baseM = dados.nextDouble();
        basem = dados.nextDouble();
        altura = dados.nextDouble();
        area = ((baseM + basem) * altura)/2;
        System.out.println("O resultado da área é: " + area);
        dados.close();
        System.exit(0);
    }
}
