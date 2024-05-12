import java.util.Scanner;

public class q05 {
    public static void main(String[] args){
        double consumo, km, kmrodados, litrosAb, litrosMax;
        Scanner dados = new Scanner(System.in);
        System.out.println("Informe os dados para o calculo do consumo \n ");
        System.out.println("Quilometragem de tanque cheio: ");
        km = dados.nextDouble(); 
        System.out.println("Quilometragem de tanque vazio: ");
        kmrodados = dados.nextDouble(); 
        System.out.println("Litro atual do carro: ");
        litrosAb = dados.nextDouble(); 
        System.out.println("Litro máximo do carro: ");
        litrosMax = dados.nextDouble();
        consumo = (kmrodados - km) / (litrosMax - litrosAb);
        System.out.println("O consumo foi de: " + consumo);
        dados.close();
        System.exit(0);


    }
    
}
