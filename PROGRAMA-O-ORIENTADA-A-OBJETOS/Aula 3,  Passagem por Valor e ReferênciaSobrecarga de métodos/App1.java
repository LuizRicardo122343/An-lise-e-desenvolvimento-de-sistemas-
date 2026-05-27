
//Exemplo Passagem por Referência

public class App1 {
    public static void main(String[] args)  {

        int []vetorInteiros = {10, 20, 30, 40, 50};

        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.print(vetorInteiros[i] + "");
        }
        modificar(vetorInteiros);

        System.out.println("\n==== vetor apos chama do metodos =====");
        for (int i=0; i < vetorInteiros.length; i++) {
            System.out.print(vetorInteiros[i] + "");
        }
    }

     static void modificar(int []vetor) {
      for(int i = 0; i < vetor.length; i++) {
        vetor[i] = vetor[i] / 2;
      }
    }
 }