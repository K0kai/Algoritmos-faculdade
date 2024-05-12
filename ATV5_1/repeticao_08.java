
/**
 * @(#)repeticao_08.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @10/05/2024
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class repeticao_08 {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) { // mais uma vez o scanner com o metodo try-with-resources
            String ultimaEntrada;
            ArrayList<String> alunos = new ArrayList<>();
            ArrayList<Double> notas = new ArrayList<>();
            ArrayList<Double> medias = new ArrayList<>(); // nessas 3 linhas de codigo criamos uma lista de array do tipo double e string para armazenar o nome dos alunos, das notas e das medias
            double media = 0;
            int contNota = 0, contAluno = 0, contOk = 0; // contadores necessarios para o funcionamento do codigo, preste atenção em como cada um deles é usado
            boolean finalizar = false, ok = false;
            while (finalizar == false) {
                System.out.println("Digite o nome do aluno ou digite \"encerrar\" para sair: ");
                ultimaEntrada = entrada.nextLine(); // armazenamos a entrada do usuario em uma variável para ser usada depois              
                if (ultimaEntrada.isBlank() == false && ultimaEntrada.equalsIgnoreCase("Encerrar") == false) { // o metodo .equalsIgnoreCase() compara a string chamando o metodo com a string em parenteses, neste caso ela ignora a caixa alta, fazendo com que encerrar = Encerrar
                    alunos.add(ultimaEntrada);
                    System.out.println("Digite as notas do aluno: ");
                    while (ok == false) { // enquanto ok estiver falso rodaremos essa parte do while, isso porque para o catch voltar ao inicio do try após um erro, ele precisa estar dentro de um loop
                        //int contOk = 0;
                        try {
                            for (int i = 0; i < 4; i++, contOk++) {
                                notas.add(entrada.nextDouble());
                                entrada.nextLine();
                                contNota++;
                                System.out.println(contNota);
                                System.out.println(contOk);
                            }
                            contOk = 0;
                            ok = true; // apos concluirmos o loop e nenhum erro ter acontecido, alteramos o ok para verdadeiro
                        } catch (InputMismatchException e) { // capturamos um erro caso haja do numero digitado não ser compativel com o tipo double
                            System.out.println("Número não identificado, insira novamente as notas:");
                            entrada.nextLine();
                            for (int i = 0; i < contOk; i++) {
                                notas.remove(contNota - contOk); // limpamos o progresso atual de onde ocorreu o erro no codigo para recomeçar do inicio a leitura das notas
                            }
                            contNota = contNota - contOk;
                            contOk = 0;
                        }
                    }
                    ok = false;
                    for (int i = contAluno * 4; i < contNota; i++) { // loop para calcular a media das notas
                        media = (media + notas.get(i));
                    }
                    medias.add(media / 4); // adicionamos a media a um novo espaço da arraylist
                    media = 0;
                    contAluno++;
                } else if (ultimaEntrada.isBlank() == false && ultimaEntrada.equalsIgnoreCase("Encerrar") == true) { // encerramos o loop após a pessoa digitar "encerrar"
                    System.out.println("Encerrado");
                    finalizar = true;
                } else if (ultimaEntrada.isBlank() == true) {
                    System.out.println("O nome está em branco"); // caso ocorra da pessoa não digitar um nome voltamos ao inicio
                }
            }
            for (int i = 0; i < contAluno; i++) { // fazemos um loop de 0 até a quantidade de alunos registrados para mostrar as medias
                if (medias.get(i) >= 6.5) {
                    System.out.printf("A média do aluno %s foi %.1f e o aluno foi aprovado\n", alunos.get(i), medias.get(i));
                } else if (medias.get(i) < 6.5) {
                    System.out.printf("A média do aluno %s foi %.1f e o aluno foi reprovado\n", alunos.get(i), medias.get(i));
                }
            }
        }
    }

}
