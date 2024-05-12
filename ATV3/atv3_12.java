import java.util.Scanner;

public class atv3_12 {
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);
        String nome, input;
        String[] espec = {"Pediatria", "Clínica Geral", "Geriatria"};
        String[] armazenamento;
        byte idade;
        System.out.println("Informe seu nome e sua idade, separados por virgula");
        input = dados.nextLine();
        armazenamento = input.trim().split("\\s*,\\s*");
        nome = armazenamento[0];
        idade = Byte.parseByte(armazenamento[1]);
        if (idade <= 12){
            System.out.printf("O paciente %s, de idade %d anos, será atendido pela %s", nome, idade, espec[0]);
        }
        else if (idade > 12 && idade < 60){
            System.out.printf("O paciente %s, de idade %d anos, será atendido pela %s", nome, idade, espec[1]);
        }
        else if (idade >= 60){
            System.out.printf("O paciente %s, de idade %d anos, será atendido pela %s", nome, idade, espec[2]);
        }
        dados.close();

    }
}
