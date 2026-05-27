//1 –Criar  o método encontrarMax()que retorne o maior valorentre dois números lidos no main().
// •O método deve  receber dois parâmetros  do tipo int.

public class App3 {

    public static int encontrarMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int max = encontrarMax(n1, n2);
        System.out.println("O maior número é: " + max);
    }
}
