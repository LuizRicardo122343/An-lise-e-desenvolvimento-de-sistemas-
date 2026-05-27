package PilhasDinamicas;

public class Stack {
    public static void main(String[] args) {
        Pilha[] vetor = new Pilha[10];

        vetor[0] = new Pilha();
        vetor[1] = new Pilha();
        vetor[2] = new Pilha();
        vetor[3] = new Pilha();
        vetor[4] = new Pilha();
        vetor[5] = new Pilha();
        vetor[6] = new Pilha();
        vetor[7] = new Pilha();
        vetor[8] = new Pilha();
        vetor[9] = new Pilha();
        //display
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i].display());
        }
 /////////////////////////////////////////////////////////       
        Pilha pD = new Pilha();

        pD.push(10);//[0]
        pD.push(20);//[1]
        pD.push(30);//[2]

        System.out.println(pD.display());

        System.out.println("true se a lista está vazia " + pD.isEmpty());

        System.out.println("remove do topo " + pD.pop());
        System.out.println("remove do topo " + pD.pop());
        System.out.println("remove do topo " + pD.pop());

        System.out.println(pD.display());

        pD.push(10);//[0]
        pD.push(20);//[1]
        pD.push(30);//[2]

        System.out.println("conta quantos nó existem " + pD.size());
        
        System.out.println("topo da pilha " + pD.peek());
    }
}