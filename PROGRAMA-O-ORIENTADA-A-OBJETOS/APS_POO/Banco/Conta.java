package Banco;

public abstract class Conta {
    private int numeroConta;
    private String nomeCliente;
    private String cpf;
    protected double saldo;

    public Conta(int numeroConta, String nomeCliente, String cpf) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.saldo = 0.0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valorSacado) {
        if (saldo >= valorSacado) {
            saldo -= valorSacado;
            return true;
        }
        return false;
    }

    public boolean depositar(double valorDepositado) {
        if (valorDepositado > 0) {
            saldo += valorDepositado;
            return true;
        }
        return false;
    }

    public String imprimir() {
        return "Conta: " + numeroConta + "\nCliente: " + nomeCliente + "\nCPF: " + cpf + "\nSaldo: " + saldo;
    }
}
