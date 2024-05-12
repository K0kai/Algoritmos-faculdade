
/**
 * @(#)repeticao_09.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @10/05/2024
 */

import java.util.Scanner;
import java.util.stream.DoubleStream;

public class repeticao_09 {

    public static void main(String[] args) {
        double notas[] = new double[10];
        int reprovados = 0, aprovados = 0;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Insira a nota final dos 10 alunos");
            for (int i = 0; i < notas.length; i++) {
                notas[i] = entrada.nextDouble();
                entrada.nextLine();
            }
            var media = DoubleStream.of(notas).average().getAsDouble(); // utilizamos a classe DoubleStream para pegar a media do array (não esqueçã de inicializar ela antes de usar assim como se inicializa o Scanner)
            for (int i = 0; i < notas.length; i++) { // Lembrando que o DoubleStream só funciona para o array comum, não funciona para o arraylist
                if (notas[i] >= 60.0) {
                    aprovados++;
                } else {
                    reprovados++;
                }
            }
            System.out.printf("A média da nota dos alunos foram %.1f e um total de %d alunos foram aprovados, %d foram reprovados", media, aprovados, reprovados);
        }
    }
}
