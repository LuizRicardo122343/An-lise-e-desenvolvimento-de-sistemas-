package App7;

public class CartaBaralho {
    private int valor; // 1 a 13 (ás a rei)
    private int naipe; // 1 a 4 (♣ ♦ ♥ ♠)

    // Construtor com validação
    public CartaBaralho(int valor, int naipe) {
        this.valor = (valor >= 1 && valor <= 13) ? valor : 1;
        this.naipe = (naipe >= 1 && naipe <= 4) ? naipe : 1;
    }

    public int getValor() {
        return valor;
    }

    public int getNaipe() {
        return naipe;
    }

    // ✅ Método mostrarCarta()
    public String mostrarCarta() {
        String nomeValor;
        switch (valor) {
            case 1: nomeValor = "Ás"; break;
            case 11: nomeValor = "Valete"; break;
            case 12: nomeValor = "Dama"; break;
            case 13: nomeValor = "Rei"; break;
            default: nomeValor = String.valueOf(valor); break;
        }

        String nomeNaipe;
        switch (naipe) {
            case 1: nomeNaipe = "Paus ♣"; break;
            case 2: nomeNaipe = "Ouros ♦"; break;
            case 3: nomeNaipe = "Copas ♥"; break;
            case 4: nomeNaipe = "Espadas ♠"; break;
            default: nomeNaipe = "Desconhecido"; break;
        }

        return nomeValor + " de " + nomeNaipe;
    }

    // ✅ Método imprimir() opcional
    public String imprimir() {
        return "Carta sorteada: " + mostrarCarta();
    }
}
