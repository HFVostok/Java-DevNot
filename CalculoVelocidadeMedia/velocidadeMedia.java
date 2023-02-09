package calcularVelocidadeMedia;

public class velocidadeMedia {
    public static void main(String[] args) {
        //obter distancia percorrida pelo usuario
        int distanciaPercorrida = 285000000;
        //*obter tempo gasto pelo usuario*/
        int tempoGasto = 70;
        //calcular velocidade média
        float velocidadeMedia = distanciaPercorrida/tempoGasto;
        //mostre a velocidae média
        System.out.println("A Velociade Média é"
        +velocidadeMedia+"KH/H");
    }
}
