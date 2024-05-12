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
        try (Scanner entrada = new Scanner(System.in)) {
            String ultimaEntrada;
            ArrayList<String> alunos = new ArrayList<>();
            ArrayList<Double> notas = new ArrayList<>();
            ArrayList<Double> medias = new ArrayList<>();
            double media = 0;
            int contNota = 0, contAluno = 0, contMedia = 0;
            boolean finalizar = false, ok = false;
            while (finalizar == false) {
                System.out.println("Digite o nome do aluno ou digite \"encerrar\" para sair: ");
                ultimaEntrada = entrada.nextLine();                
                if ( ultimaEntrada.isBlank() == false && ultimaEntrada.equalsIgnoreCase("Encerrar") == false ) {
                    alunos.add(ultimaEntrada);
                    System.out.println("Digite as notas do aluno: ");                    
                    while (ok == false) {
                        try {
                            for (int i = 0; i < 4; i++) {
                                notas.add(entrada.nextDouble());
                                entrada.nextLine();
                                contNota++;
                            }
                            ok = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Número não identificado, insira novamente as notas:");
                            entrada.nextLine();
                        }
                    }
                    ok = false;                    
                    for (int i = contMedia; i < contNota; i++) {
                        media = (media + notas.get(i));
                    }
                    medias.add(media / 4);
                    media = 0;                    
                    contMedia = contMedia + 4;
                    contAluno++;
                } else if (ultimaEntrada.isBlank() == true){
                    System.out.println("O nome está em branco");
                } else if (ultimaEntrada.isBlank() == false && ultimaEntrada.equalsIgnoreCase("Encerrar") == true) {
                    System.out.println("Encerrado");
                    finalizar = true;
                }
            }   for (int i = 0; i < contAluno; i++) {
                if (medias.get(i) >= 6.5) {
                    System.out.printf("A média do aluno %s foi %.1f e o aluno foi aprovado\n", alunos.get(i), medias.get(i));
                } else if (medias.get(i) < 6.5) {
                    System.out.printf("A média do aluno %s foi %.1f e o aluno foi reprovado\n", alunos.get(i), medias.get(i));
                }
            }
        }
    }
}
