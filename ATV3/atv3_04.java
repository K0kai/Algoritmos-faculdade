import java.util.Scanner;

public class atv3_04 {
    public static void main(String[] args){
        String time1,time2; 
        byte gol1,gol2;
        Scanner dados = new Scanner(System.in);
        System.out.println("Insira o nome do primeiro time");
        time1 = dados.nextLine();
        System.out.println("Agora do segundo time");
        time2 = dados.nextLine();
        System.out.println("Insira a quantidade de gols que o time 1 fez na partida");
        gol1 = dados.nextByte();
        System.out.println("Agora a quantidade de gols do segundo time");
        gol2 = dados.nextByte();
        if (gol1 > gol2){
            System.out.println("O time " + time1 + " é o vencedor da partida");
        } else if (gol2 > gol1){
            System.out.println("O time " + time2 + " é o vencedor da partida");
        }
        else{
            System.out.println("Houve um empate entre os dois times");
        }
        dados.close();
    }
}
