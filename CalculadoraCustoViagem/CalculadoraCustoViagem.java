package CalculadoraCustoViagem;

/**
 * CalculadoraCustoViagem
 */
 public class CalculadoraCustoViagem {

     public static void main(String[] args) {

        double distnaciaPercorrida = 4169; // em KM

        double precoDaGasolina = 6,69; // em Reais

        double quilometrosPorLitro = 1.41;// Km/l

        double valorEstimadoDaViagem = (((distnaciaPercorrida / quilometrosPorLitro) * precoDaGasolina) * 2); // em
                                                                                                              // Reais

         System.out.println("O custo Estimado é de:");
         System.out.println("R$ " + valorEstimadoDaViagem);
     }

}