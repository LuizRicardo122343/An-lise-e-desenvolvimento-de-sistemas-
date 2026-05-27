//Exemplo 1 –Método com retorno e com parâmetros
public class App {
    public static void main(String[] args) throws Exception {
       int valorRetornado;

       valorRetornado = somar(10,10);

       System.out.println("Soma: " + valorRetornado);
}
       static int somar(int n1, int n2) {
           int rescultado;
           rescultado  = n1 + n2;
           return rescultado;
    }
}