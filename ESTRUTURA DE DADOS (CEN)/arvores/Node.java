package arvores;
public class Node { // No
    int elemento, fatorBalanceamento;
    Node esquerda, direita, pai;

    public Node(int elemento) {
        this.elemento = elemento;
        fatorBalanceamento = 0;
        esquerda = direita = pai = null;
    }

    @Override
    public String toString() {
        return String.valueOf(elemento);
    }
}