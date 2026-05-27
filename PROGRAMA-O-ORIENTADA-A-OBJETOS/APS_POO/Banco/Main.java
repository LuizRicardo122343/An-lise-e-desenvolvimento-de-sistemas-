package Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciarContas gerenciador = new GerenciarContas();
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("1. Adicionar Conta");
            System.out.println("2. Remover Conta");
            System.out.println("3. Listar Contas");
            System.out.println("4. Sacar");
            System.out.println("5. Depositar");
            System.out.println("6. Transferir");
            System.out.println("7. Buscar Contas Especiais");
            System.out.println("8. Buscar Clientes Usando Limite");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Tipo de conta: 1- Corrente | 2- Poupança | 3- Especial");
                    int tipo = sc.nextInt();
                    System.out.print("Número da conta: ");
                    int numero = sc.nextInt();
                    sc.nextLine();  // Limpar buffer
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();

                    Conta novaConta = null;

                    if (tipo == 1) {
                        System.out.print("Limite (opcional - 0 se não quiser): ");
                        double limite = sc.nextDouble();
                        if (limite > 0) {
                            novaConta = new ContaCorrente(numero, nome, cpf, limite);
                        } else {
                            novaConta = new ContaCorrente(numero, nome, cpf);
                        }
                    } else if (tipo == 2) {
                        novaConta = new ContaPoupanca(numero, nome, cpf);
                    } else if (tipo == 3) {
                        System.out.print("Limite: ");
                        double limite = sc.nextDouble();
                        sc.nextLine();  // Limpar buffer
                        System.out.print("Nome do gerente: ");
                        String gerente = sc.nextLine();
                        novaConta = new ContaEspecial(numero, nome, cpf, limite, gerente);
                    }

                    if (novaConta != null) {
                        gerenciador.adicionarConta(novaConta);
                        System.out.println("Conta adicionada com sucesso!");
                    }
                    break;

                case 2:
                    System.out.print("Número da conta: ");
                    int numRemover = sc.nextInt();
                    if (gerenciador.removerConta(numRemover)) {
                        System.out.println("Conta removida.");
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 3:
                    System.out.println(gerenciador.listarContas());
                    break;

                case 4:
                    System.out.print("Número da conta: ");
                    int numSacar = sc.nextInt();
                    System.out.print("Valor: ");
                    double valorSacar = sc.nextDouble();
                    if (gerenciador.sacar(numSacar, valorSacar)) {
                        System.out.println("Saque realizado.");
                    } else {
                        System.out.println("Saque não realizado.");
                    }
                    break;

                case 5:
                    System.out.print("Número da conta: ");
                    int numDepositar = sc.nextInt();
                    System.out.print("Valor: ");
                    double valorDepositar = sc.nextDouble();
                    if (gerenciador.depositar(numDepositar, valorDepositar)) {
                        System.out.println("Depósito realizado.");
                    } else {
                        System.out.println("Depósito não realizado.");
                    }
                    break;

                case 6:
                    System.out.print("Conta de origem: ");
                    int contaOrigem = sc.nextInt();
                    System.out.print("Conta de destino: ");
                    int contaDestino = sc.nextInt();
                    System.out.print("Valor: ");
                    double valorTransf = sc.nextDouble();
                    if (gerenciador.transferirValor(contaOrigem, contaDestino, valorTransf)) {
                        System.out.println("Transferência realizada.");
                    } else {
                        System.out.println("Transferência falhou.");
                    }
                    break;

                case 7:
                    System.out.println(gerenciador.buscarContasEspeciais());
                    break;

                case 8:
                    System.out.println(gerenciador.buscarClientesUsandoLimite());
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
