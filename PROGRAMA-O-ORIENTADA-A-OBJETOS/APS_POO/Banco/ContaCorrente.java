package Banco;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numeroConta, String nomeCliente, String cpf) {
        super(numeroConta, nomeCliente, cpf);
        this.limite = 0.0;
    }

    public ContaCorrente(int numeroConta, String nomeCliente, String cpf, double limite) {
        super(numeroConta, nomeCliente, cpf);
        this.limite = limite;
    }

    public boolean usandoLimite() {
        return saldo < 0;
    }

    @Override
    public boolean sacar(double valorSacado) {
        if (saldo + limite >= valorSacado) {
            saldo -= valorSacado;
            return true;
        }
        return false;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + "\nLimite: " + limite;
    }
}
