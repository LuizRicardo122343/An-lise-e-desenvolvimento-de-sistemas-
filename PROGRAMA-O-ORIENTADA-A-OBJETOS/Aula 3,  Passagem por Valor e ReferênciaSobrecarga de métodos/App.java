/////////Exemplo Passagem por Valor
public class App {
    public static void main(String[] args) throws Exception {

        int a = 50;
        
        modificar(a);
        System.out.println("Valor: "+a);
    }

    static void modificar(int a) {
        a = 200;
        System.out.println("Valor: "+a);
    }

}