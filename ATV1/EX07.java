import java.util.Scanner;

class EX07{
    public static void main(String[] args){
        String letraa,letrar;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Digite a letra \"a\" ou \"r\" ");
        letraa = entrada.next();
        System.out.println("Digite a letra \"a\" ou \"r\" ");
        letrar = entrada.next();
        if (letraa.equals("a")){
            // não faça nada
            }
        else{
            letraa = "a";
        }
        if (letrar.equals("r")){
            // não faça nada
            }
        else{
            letrar = "r";
        }
        String palavra = letraa + letrar + letraa + letrar + letraa;
        System.out.printf("%s", palavra);
        entrada.close();
        System.exit(0);
    }
} 