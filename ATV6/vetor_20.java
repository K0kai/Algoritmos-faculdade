
public class vetor_20 {

    public static void main(String[] args) {
        int[] vetor = new int[80];
        int menorElemento, maiorElemento, posicaoMenor, posicaoMaior;

        for (int i = 0; i < 80; i++) {
            vetor[i] = (int) Math.floor((Math.random() * 101));
        }

        menorElemento = vetor[0];
        maiorElemento = vetor[0];
        posicaoMenor = 0;
        posicaoMaior = 0;

        for (int i = 1; i < 80; i++) {
            if (vetor[i] < menorElemento) {
                menorElemento = vetor[i];
                posicaoMenor = i;
            }
            if (vetor[i] > maiorElemento) {
                maiorElemento = vetor[i];
                posicaoMaior = i;
            }
        }

        System.out.println("Menor elemento: " + menorElemento + ", posição: " + posicaoMenor);
        System.out.println("Maior elemento: " + maiorElemento + ", posição: " + posicaoMaior);
    }
}
