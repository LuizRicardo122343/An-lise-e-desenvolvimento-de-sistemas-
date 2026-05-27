package App;

public class Lampada {
    // Atributos privados
    private String marca;
    private String tipo;  // Ex.: LED, Fluorescente
    private int potencia; // Em watts
    private double preco;
    private boolean ligada;

    public Lampada() {
        // Construtor sem parâmetros
    }

    // Construtor
    public Lampada(String marca, String tipo, int potencia, double preco) {
        this.marca = marca;
        this.tipo = tipo;
        this.potencia = potencia;
        this.preco = preco;
        this.ligada = false; // Estado inicial desligada
    }

    // Métodos de acesso (getters e setters)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isLigada() {
        return ligada;
    }

    // Métodos de comportamento
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void exibirEstado() {
        if (ligada) {
            System.out.println("A lâmpada está ligada.");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }
    public String imprimir () {
        return "\nMarca: " + marca + "\nTipo: " + tipo + "\nPotência: " + potencia + "W\nPreço: R$" + preco + "\n";
    }
}
