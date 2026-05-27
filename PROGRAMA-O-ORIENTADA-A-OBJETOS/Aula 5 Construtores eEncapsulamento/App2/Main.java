package App2;

public class Main {
    public static void main(String[] args) {
        RoboSimples robo1 = new RoboSimples('L');
        System.out.println(robo1.imprimir());

        RoboSimples robo2 = new RoboSimples('X'); // direção inválida
        System.out.println(robo2.imprimir());
    }
}
