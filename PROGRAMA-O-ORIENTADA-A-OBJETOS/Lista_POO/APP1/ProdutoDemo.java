package APP1;

import java.util.Scanner;

public class ProdutoDemo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Criando vetor com 5 objetos Produto
        Produto[] produtos = new Produto[5];
        produtos[0] = new Produto("Arroz", 5.99, 100);
        produtos[1] = new Produto("Feijao", 7.49, 50);
        produtos[2] = new Produto("Macarrao", 3.29, 80);
        produtos[3] = new Produto("Acucar", 2.99, 120);
        produtos[4] = new Produto("Cafe", 12.99, 40);

        while (true) {
            System.out.print("Digite o nome do produto (ou 'fim' para sair): ");
            String nome = leitor.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            boolean encontrado = false;

            for (Produto p : produtos) {
                if (p.getDescricao().equalsIgnoreCase(nome)) {
                    System.out.println("Preço: R$ " + p.getPreco());
                    System.out.println("Saldo: " + p.getSaldo() + " unidades");
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Produto inexistente no catálogo.");
            }
        }

        leitor.close();
    }
}
