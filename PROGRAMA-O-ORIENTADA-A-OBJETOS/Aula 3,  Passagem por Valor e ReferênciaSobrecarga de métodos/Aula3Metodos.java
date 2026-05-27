import java.util.Scanner;


public class Aula3Metodos {

    public static void lerVetor(int[] vetor) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }
    }

    public static int somarNumeros(int[] vetor) {
        int soma = 0;
        for (int num : vetor) {
            soma += num;
        }
        return soma;
    }

    public static double calcularMedia(int[] vetor) {
        int soma = somarNumeros(vetor);
        return (double) soma / vetor.length;
    }

    public static void main(String[] args) {
        int[] numeros = new int[10];

        lerVetor(numeros);
        
        int soma = somarNumeros(numeros);
        double media = calcularMedia(numeros);

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
