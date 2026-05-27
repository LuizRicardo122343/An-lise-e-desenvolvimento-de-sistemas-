package FilaDinamica;


public class Stack {
    public static void main(String[] args) {
        Fila pilha = new Fila();
        System.out.println(pilha.isEmpty());
        pilha.enqueue(1);
        pilha.enqueue(2);
        pilha.enqueue(3);
        System.out.println(pilha.show());

        System.out.println(pilha.isEmpty());

        System.out.println(pilha.dequeue());
        System.out.println(pilha.dequeue());
        System.out.println(pilha.dequeue());

        System.out.println(pilha.show());

        pilha.enqueue(4);
        pilha.enqueue(5);
        pilha.enqueue(6);
        System.out.println(pilha.dequeue());
        System.out.println(pilha.peek());
        System.out.println(pilha.show());
        System.out.println(pilha.size());
    }
}
