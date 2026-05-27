package Banco;

public class ContaEspecial extends ContaCorrente {
    private String nomeGerente;

    public ContaEspecial(int numeroConta, String nomeCliente, String cpf, String nomeGerente) {
        super(numeroConta, nomeCliente, cpf);
        this.nomeGerente = nomeGerente;
    }

    public ContaEspecial(int numeroConta, String nomeCliente, String cpf, double limite, String nomeGerente) {
        super(numeroConta, nomeCliente, cpf, limite);
        this.nomeGerente = nomeGerente;
    }

    public String getNomeGerente() {
        return nomeGerente;
    }

    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + "\nGerente: " + nomeGerente;
    }
}
