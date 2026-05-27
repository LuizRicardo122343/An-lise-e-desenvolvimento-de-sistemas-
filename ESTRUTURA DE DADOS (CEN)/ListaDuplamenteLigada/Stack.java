package ListaDuplamenteLigada;


public class Stack {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.insereNoComeco(1);//adiciona 1 na posição 2
        lista.insereNoComeco(2);//adiciona 2 na posição 1
        lista.insereNoComeco(3);//adiciona 3 na posição 0

        lista.deleteFirst();

        lista.displayForward();

        System.out.println("Removendo o valor 2 da lista " + lista.deleteKey(2).getDado());

        lista.displayForward();

        lista.insereNoFim(2);//adiciona 2 na porrão 3
        lista.insereNoFim(3);//adiciona 3 na porrão 2
        lista.insereNoFim(4);//adiciona 4 na porrão 1

        lista.deleteLast();

  


        



    }
        
}