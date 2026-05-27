package Banco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numeroConta, String nomeCliente, String cpf) {
        super(numeroConta, nomeCliente, cpf);
    }

    public void calculaRendimento(double porcentagemRendimento) {
        if (porcentagemRendimento > 0) {
            saldo += saldo * (porcentagemRendimento / 100);
        }
    }
}
