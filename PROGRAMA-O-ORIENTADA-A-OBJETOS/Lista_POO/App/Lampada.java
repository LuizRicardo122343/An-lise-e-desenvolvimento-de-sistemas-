package App;

public class Lampada {
    private int potencia;
    private String estado;

    // Construtor parametrizado
    public Lampada(String estado, int potencia) {
        this.estado = estado;
        this.potencia = potencia;
    }

    public void ligar() {
        this.estado = "ligado";
    }

    public void desligar() {
        this.estado = "desligado";
    }

    public int getPotencia() {
        return potencia;
    }

    public String getEstado() {
        return estado;
    }
}

