package App;

public class LampadaDemo {
    public static void main(String[] args) {
        // Criando objeto Lampada com parâmetros
        Lampada lamp = new Lampada("desligado", 100);

        System.out.println("Estado inicial: " + lamp.getEstado());
        System.out.println("Potência inicial: " + lamp.getPotencia() + "W");

        // Ligando e desligando
        lamp.ligar();
        System.out.println("Estado após ligar: " + lamp.getEstado());

        lamp.desligar();
        System.out.println("Estado após desligar: " + lamp.getEstado());
    }
}
