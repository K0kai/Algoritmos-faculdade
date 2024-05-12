public class q07 {
    public static void main(String[] args){
        int precolata, quantlitro, area, quantcomodo, resultado, eficiencia;
        precolata = 50;
        quantlitro = 5;
        eficiencia = 3;
        area = 10;
        quantcomodo = 6;
        resultado = ((area * quantcomodo) /eficiencia) / quantlitro;
        System.out.println("Você precisará de " + resultado + " latas para pintar os comodos");

    }
}
