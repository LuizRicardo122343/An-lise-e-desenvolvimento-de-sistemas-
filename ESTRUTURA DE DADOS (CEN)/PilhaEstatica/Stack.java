package PilhaEstatica;

public class Stack {
    public static void main(String[] args) {
    Pilha cl = new Pilha(20);

    cl.push(8);//[0]
    cl.push(3);//[1]
    cl.push(9);//[2]
    cl.push(1);//[3]
    cl.print();
    System.out.println("Remover um elemento do topo " + cl.pop());
    System.out.println("Remover um elemento do topo " + cl.pop());
    System.out.println("Remover um elemento do topo " + cl.pop());
    System.out.println("Remover um elemento do topo " + cl.pop());
    System.out.println("Remover um elemento do topo " + cl.pop());
    System.out.println("Verificar se a pilha está vazia " + cl.isEmpty());

    cl.push(8);//[0]
    cl.push(3);//[1]
    cl.push(9);//[2]
    cl.push(1);//[3]
    System.out.println("Retorna o elemento do topo " + cl.peek());

    cl.push(8);//[0]
    cl.push(3);//[1]

    System.out.println("Retorna o elemento do topo " + cl.peek());

    cl.push(8);//[0]
    cl.push(3);//[1]
    cl.push(9);//[2]
    cl.push(1);//[3]

    System.out.println("Retorna o número de elementos da pilha " + cl.size());

    cl.push(8);//[0]
    cl.push(3);//[1]
    cl.push(9);//[2]
    cl.push(1);//[3]
    System.out.println("Verificar se a pilha está vazia " + cl.isEmpty());
    }
}