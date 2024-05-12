/**
 * @(#)repeticao_01.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @08/05/2024
 */


import java.util.Scanner;
import java.util.stream.IntStream;

public class repeticao_01 {
    public static void main(String[] args){
        try (Scanner entrada = new Scanner(System.in)) {
            int votos[] = new int[6]; //Cria um novo array/vetor com 6 espaços para dados
            int voto;
            boolean encerrar = false;
            while (encerrar == false){ // Enquanto a variável boleana for falsa, o loop while irá repetir
                System.out.println("Digite de 1 a 4 para votar nos candidatos, 5 para voto nulo e 6 para voto em branco e caso deseje encerrar, digite 0");
                voto = 0;
                voto = entrada.nextInt();
                entrada.nextLine();
                switch (voto){ // switch case para votação dos candidatos
                    case 0:
                        encerrar = true;
                        break;
                    case 1:
                        votos[voto - 1] = votos[voto - 1] + 1;
                        break;
                    case 2:
                        votos[voto - 1] = votos[voto - 1] + 1;
                        break;
                    case 3:
                        votos[voto - 1] = votos[voto - 1] + 1;
                        break;
                    case 4:
                        votos[voto - 1] = votos[voto - 1] + 1;
                        break;
                    case 5:
                        votos[voto - 1] = votos[voto - 1] + 1;
                        break;
                    case 6:
                        votos[voto - 1] = votos[voto - 1] + 1;
                        break;
                    default:
                        System.out.println("Numero inválido");
                        break;
                }
            }
            double total = (double) IntStream.of(votos).sum(); // Soma todos os valores dentro do vetor votos
            double[] percentual = new double[votos.length]; // Cria um novo vetor com o mesmo tamanho de dados do vetor votos
            for (int i = 0; i < percentual.length; i++){ // Loop que faz os calculos e adiciona os valores para o vetor, onde i < percentual.length, faz com que i não exceda o tamanho do vetor
                percentual[i] = (double) votos[i];
                percentual[i] = (percentual[i] / total) * 100;
            }
            System.out.printf("O total de votos para o candidato 1 é %d e seu percentual sobre o total é %.1f%%\nO total de votos para o candidato 2 é %d e seu percentual sobre o total é %.1f%%\nO total de votos para o candidato 3 é %d  e seu percentual sobre o total é %.1f%%\nO total de votos para o candidato 4 é %d e seu percentual sobre total é %.1f%%\nO total de votos nulos é %d e seu percentual sobre o total é %.1f%%\nO total de votos em branco é %d e seu percentual sobre o total é %.1f%%", votos[0], percentual[0], votos[1], percentual[1], votos[2], percentual[2], votos[3], percentual[3], votos[4], percentual[4], votos[5], percentual[5]);
        } //Cria um novo array/vetor com 6 espaços para dados
    }
    
}
