package ListaDinamica;

public class Stack {
    public static void main(String[] args) {
        App lista = new App();

        lista.insertAtFront(5);//adiciona 5 na posição 2
        lista.insertAtFront(4);//adiciona 4 na posição 1
        lista.insertAtFront(3);//adiciona 3 na posição 0
        
        System.out.println(" a remoção do valor 4 da lista " + lista.removefromFront());

        System.out.println("o valor 3 esta na posição " + lista.find(5));

        lista.insertAtBack(1); //adiciona 1 na posição 0
        lista.insertAtBack(2); //adiciona 2 na posição 1

        System.out.println(" a remoção do valor 1 da lista " + lista.removeFromBack());

        //find
        System.out.println("o valor 3 esta na posição " + lista.find(1));

        //remove
        System.out.println(" a remoção do valor 3 da lista " + lista.remove(3));

        lista.print();

    }
}


