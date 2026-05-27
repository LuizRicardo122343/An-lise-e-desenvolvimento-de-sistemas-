//Exercícios•4 –Criar  o método calcularFatorial()que receba como parâmetro  um número inteiro  e retorne o fatorial  calculado.

public class App6 {

    public static int calcularFatorial(int numero) {
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        int resultado = calcularFatorial(5);
        System.out.println("Fatorial de 5 é: " + resultado);
    }
}
