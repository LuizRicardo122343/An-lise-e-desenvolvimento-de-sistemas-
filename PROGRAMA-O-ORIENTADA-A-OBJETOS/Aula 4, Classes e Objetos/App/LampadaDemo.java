package App;

public class LampadaDemo {
    public static void main(String[] args) {
        // Criando o objeto com o construtor
        Lampada lamp = new Lampada("Philips", "LED", 15, 29.90);

        // Ligando e exibindo estado
        lamp.ligar();
        lamp.exibirEstado();

        // Desligando e exibindo estado
        lamp.desligar();
        lamp.exibirEstado();

        // Imprimindo tudo
        System.out.println(lamp.imprimir());
    }
}
