package App7;

public class Main {
    public static void main(String[] args) {
        CartaBaralho carta1 = new CartaBaralho(1, 4);   // Ás de Espadas
        CartaBaralho carta2 = new CartaBaralho(12, 3);  // Dama de Copas

        System.out.println(carta1.imprimir());
        System.out.println(carta2.imprimir());
    }
}
