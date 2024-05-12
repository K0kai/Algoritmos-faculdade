
/**
 * @(#)repeticao_06.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @10/05/2024
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class repeticao_06 {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) { // Geralmente com o scanner, finalizamos ele no fim do codigo quando já não precisamos dele mais usando o scanner.close() para evitar o desperdicio de recursos, porém o visual studio me recomendou o try-with-resources que faz basicamente a mesma coisa só que melhor
            char ler; // Leia mais sobre o try-with-resources aqui: https://pt.stackoverflow.com/questions/172909/como-funciona-o-try-with-resources
            char[] vinhos = new char[3];
            vinhos[0] = 't';
            vinhos[1] = 'b';
            vinhos[2] = 'r';
            int[] qntd = new int[vinhos.length];
            int total = 0;
            boolean finalizar = false;
            while (finalizar == false) {
                try { // Este try pertence ao try-catch padrão para capturar erros, é diferente do try-with-resources
                    System.out.println("Digite a inicial do vinho (Exemplo: Tinto = T): \nCaso deseje finalizar o programa, digite F.");
                    ler = entrada.nextLine().charAt(0);
                    switch (ler) {
                        case 'T', 't' -> { //metodo alternativo de fazer o switch-case
                            System.out.println("Digite a quantidade de tinto em estoque: ");
                            qntd[0] = entrada.nextInt();
                            entrada.nextLine();
                            total = total + qntd[0];
                        }
                        case 'B', 'b' -> {
                            System.out.println("Digite a quantidade de branco em estoque: ");
                            qntd[1] = entrada.nextInt();
                            entrada.nextLine();
                            total = total + qntd[1];
                        }
                        case 'R', 'r' -> {
                            System.out.println("Digite a quantidade de rosê em estoque: ");
                            qntd[2] = entrada.nextInt();
                            entrada.nextLine();
                            total = total + qntd[2];
                        }
                        case 'F', 'f' -> {
                            System.out.println("Encerrado! ");
                            finalizar = true;
                        }
                        default ->
                            System.out.println("Não foi possível reconhecer o tipo do vinho, tente novamente\n");
                    }

                } catch (InputMismatchException e) { // aqui capturamos um erro padrão de leitura caso um usuario digite um valor de tipo errado (exemplo: uma letra onde era pra digitar um numero)
                    System.out.println("Ocorreu um erro, tente novamente");
                    entrada.nextLine(); // limpa o scanner

                }
            }
            System.out.printf("O total de vinhos é %d e a porcentagem do total de cada tipo de vinho é:\nTinto: %.1f%%\nBranco: %.1f%%\nRosê: %.1f%%", total, (double) qntd[0] / total * 100, (double) qntd[1] / total * 100, (double) qntd[2] / total * 100);
        }
    }

}
