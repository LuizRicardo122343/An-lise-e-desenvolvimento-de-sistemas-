package ListasEstaticas;

public class Stack {

    public static void main(String[] args) {

        Listas lista = new Listas(3);


        
        lista.add(0, 14);//adiciona 14 na posição 0
        lista.add(1, 12);//adiciona 15 na posição 1
        lista.add(2, 28);//adiciona 16 na porrão 2

        System.out.println(" a lista esta vazia " + lista.isEmpty());


        System.out.println(" a lista esta cheia " + lista.isFull());

        System.out.println("removendo o valor 14 da lista " + lista.remove(2));

        System.out.println("removendo o valor 14 da lista " + lista.remove(1));



        System.out.println("o valor na posição 0 é " + lista.get(0));



        lista.show();
       

    
        }
}