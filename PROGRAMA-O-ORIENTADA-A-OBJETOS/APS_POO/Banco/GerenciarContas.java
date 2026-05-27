package Banco;

import java.util.ArrayList;

public class GerenciarContas {
    private ArrayList<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta c) {
        contas.add(c);
    }

    public boolean removerConta(int numeroConta) {
        for (Conta c : contas) {
            if (c.getNumeroConta() == numeroConta) {
                contas.remove(c);
                return true;
            }
        }
        return false;
    }

    public String buscarContasEspeciais() {
        StringBuilder resultado = new StringBuilder();
        for (Conta c : contas) {
            if (c instanceof ContaEspecial) {
                resultado.append(c.imprimir()).append("\n\n");
            }
        }
        return resultado.toString();
    }

    public String buscarClientesUsandoLimite() {
        StringBuilder resultado = new StringBuilder();
        for (Conta c : contas) {
            if (c instanceof ContaCorrente) {
                ContaCorrente cc = (ContaCorrente) c;
                if (cc.usandoLimite()) {
                    resultado.append(cc.imprimir()).append("\n\n");
                }
            }
        }
        return resultado.toString();
    }

    public Conta buscarConta(int numeroConta) {
        for (Conta c : contas) {
            if (c.getNumeroConta() == numeroConta) {
                return c;
            }
        }
        return null;
    }

    public boolean transferirValor(int numeroContaFonte, int numeroContaDestino, double valor) {
        Conta fonte = buscarConta(numeroContaFonte);
        Conta destino = buscarConta(numeroContaDestino);
        if (fonte != null && destino != null) {
            if (fonte.sacar(valor)) {
                destino.depositar(valor);
                return true;
            }
        }
        return false;
    }

    public boolean sacar(int numeroConta, double valorSacado) {
        Conta c = buscarConta(numeroConta);
        if (c != null) {
            return c.sacar(valorSacado);
        }
        return false;
    }

    public boolean depositar(int numeroConta, double valorDepositado) {
        Conta c = buscarConta(numeroConta);
        if (c != null) {
            return c.depositar(valorDepositado);
        }
        return false;
    }

    public String listarContas() {
        StringBuilder resultado = new StringBuilder();
        for (Conta c : contas) {
            resultado.append(c.imprimir()).append("\n\n");
        }
        return resultado.toString();
    }
}
