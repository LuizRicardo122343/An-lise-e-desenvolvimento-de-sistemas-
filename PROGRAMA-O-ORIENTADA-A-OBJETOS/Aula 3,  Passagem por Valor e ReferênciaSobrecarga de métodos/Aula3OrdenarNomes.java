import java.util.Scanner;
import java.util.Arrays;

public class Aula3OrdenarNomes {

    public static void lerVetor(String[] nomes) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }
    }

    public static String[] ordenarCrescente(String[] nomes) {
        Arrays.sort(nomes);
        return nomes;
    }

    public static void imprimirVetor(String[] nomes) {
        System.out.println("Nomes ordenados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    public static void main(String[] args) {
        String[] nomes = new String[3];

        lerVetor(nomes);
        ordenarCrescente(nomes);
        imprimirVetor(nomes);
    }
}
