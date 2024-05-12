import java.util.Scanner;
class EX03{
    public static void main(String[] args){
        char[] letras = new char[5];
        Scanner entrada;
        entrada = new Scanner(System.in);
        for(int i = 0 ; i <= 4; i++){
        System.out.println("Digite uma letra: ");
        letras[i] = entrada.next().charAt(0);
        }
        for(int i = 0 ; i <= 4; i++){
        System.out.println(letras[i]);
        }
        System.out.println(letras);
        entrada.close();
        System.exit(0);
    }
}