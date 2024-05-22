
/**
 * @(#)vetor_12.java
 *
 *
 * @Luis Felipe Machado Damasceno Maia
 * @22/05/2024
 */
public class vetor_12 {

    public static void main(String[] args) {

        String[] descricoes = new String[5];
        double[] precos = new double[5];

        descricoes[0] = "Produto A";
        precos[0] = 10.0;

        descricoes[1] = "Produto B";
        precos[1] = 20.0;

        descricoes[2] = "Produto C";
        precos[2] = 30.0;

        descricoes[3] = "Produto D";
        precos[3] = 40.0;

        descricoes[4] = "Produto E";
        precos[4] = 50.0;

        for (int i = 0; i < precos.length; i++) {
            precos[i] = precos[i] * 1.10;
        }

        for (int i = 0; i < descricoes.length; i++) {
            System.out.println("Descrição: " + descricoes[i] + ", Novo Preço: R$" + String.format("%.2f", precos[i]));
        }
    }
}
