//1 –Criar  o método encontrarMax()que retorne o maior valorentre dois números lidos no main().•O método deve  receber dois parâmetros  do tipo int.

public class App4 {

    public static boolean isPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        int n = 7;

        if (isPar(n)) {
            System.out.println(n + " é par.");
        } else {
            System.out.println(n + " é ímpar.");
        }
    }
}
