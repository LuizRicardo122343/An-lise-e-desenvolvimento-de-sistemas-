package APP1;

public class Produto {
    private String descricao;
    private double preco;
    private int saldo;

    // Construtor
    public Produto(String descricao, double preco, int saldo) {
        this.descricao = descricao;
        this.preco = preco;
        this.saldo = saldo;
    }

    // Getters
    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getSaldo() {
        return saldo;
    }
}
