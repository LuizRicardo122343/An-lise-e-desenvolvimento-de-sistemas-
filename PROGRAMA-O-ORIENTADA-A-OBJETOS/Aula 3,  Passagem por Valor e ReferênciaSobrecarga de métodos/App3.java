//Exemplo implementando sobrecarga

public class App3 {
    public static void main(String[] args)  {
        int caixa;

        System.out.println("Area de qudrado: " + calcularArea(3));
        System.out.println("area de retangulo: " + calcularArea(3, 2));

        caixa = AreaComSobrecarga(3, 2, 5);
        System.out.println("area de retangulo: " + caixa);
        }
        static int calcularArea(int x) {
            return x * x;
        }
        static int calcularArea(int x, int y) {
            return x * y;
        }
    static int AreaComSobrecarga(int x, int y, int z) {
        return x * y * x;
    }
}