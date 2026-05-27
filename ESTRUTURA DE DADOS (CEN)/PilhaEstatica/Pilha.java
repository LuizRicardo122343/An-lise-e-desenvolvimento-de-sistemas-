package PilhaEstatica;

public class Pilha {
    
    //Declaração de atributos
    private int[] vetor;
    private int topo;
    //Construtor
    public Pilha(int maxSize) {
        //Inicia o vetor estático da pilha
        vetor = new int[maxSize];
        //Inicia o topo da pilha com uma posição inexistente
        topo = -1;
    } 
        //Operações (Métodos) ..
    public boolean isEmpty(){
        //Retorna true se o topo da pilha estiver vazio
        return topo == -1;
    }
    public boolean isFull(){
        //Retorna true se o topo da pilha estiver cheio
        return (topo == vetor.length - 1);
        }
    public void push(int valor){
        //insere um elemento no topo da pilha
        if(isFull() == false){
            topo++;
            vetor[topo] = valor;
        }
    }
    public int pop(){
        //remove um elemento do topo da pilha
        if(isEmpty() == false){
            return vetor[topo--];
        }
        return -1;
    }
    public int peek(){
        //consultar o elemento do topo da pilha
        if(isEmpty() == false){
            return vetor[topo];
        }
        return -1;
    }
    public int size(){
        //Retorna o número de elementos da pilha
        return (topo + 1);
    }
    public void print(){
        //Imprime todos os elementos da pilha
        for(int i = 0; i <= topo; i++){
            System.out.println(vetor[i]);
        }
    }
}