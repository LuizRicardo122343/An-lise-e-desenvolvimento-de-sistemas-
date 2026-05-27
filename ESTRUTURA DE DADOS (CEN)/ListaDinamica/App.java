package ListaDinamica;

public class App {

    private No inicio;
    private No fim;

    public App(){
        inicio = fim = null;
    }
    public boolean isEmpty() {
        return (inicio == null);
    }
    public void insertAtFront(int item) {
        //inicio e fim são nulos
        if (isEmpty()) {
            inicio = fim = new No(item);
            //inicio se refere ao novo No
        }else {
            No novoNo = new No(item);
            novoNo.setProxNo(inicio);
            inicio = novoNo;
        }
    }
    // implementar a função insertAtBack
    public void insertAtBack(int item) {
        if (isEmpty()) {
            inicio = fim = new No(item);
        }else {
            No novoNo = new No(item); 
            fim.setProxNo(novoNo); 
            fim = novoNo; 
        }
    }
    public int removefromFront() {
        if (isEmpty()) {
            return -1;
        }
        int removedltem = inicio.getDado();
        // atualiza referencias firstNode and lastNode
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.getProxNo();
        }
        return removedltem;
    }
    public int removeFromBack() {
        if (isEmpty()) {
            return -1;
        }
        int removltem = fim.getDado();
        // atualiza referencias firstNode and lastNode
        if (inicio == fim) {
            inicio = fim = null;
        }else {
            No aux = inicio;
            while (aux.getProxNo() != fim) {
                aux = aux.getProxNo();
            }
            fim = aux;
            aux.setProxNo(null);
        }
        return removltem;
    }
    public No find(int item) {
        if (isEmpty()) {
          return null; // lista vazia
        }
        No atual = inicio;
        while (atual != null) {
            if (atual.getDado() == item) {
            return atual; // encontrado
            }
            atual = atual.getProxNo();
        }
        return null; // não encontrado
    }
    public boolean remove(int item) {
        No atual = inicio;
        if (isEmpty()) {
          return false; // lista vazia
        }
        inicio = atual = inicio;
        while (atual != null && atual.getDado() != item) {
            inicio = atual;
            atual = atual.getProxNo();
        }
        if (atual == null) {
            return false;
        }
        if (atual == inicio) {
            removefromFront();
        } else {
          // encontrou na outra posição
            if (atual == fim) {
            removeFromBack();          
        }else{
            inicio.setProxNo(atual.getProxNo());
            }
        }
        return true;
    }
    public void print(){
        if (isEmpty()) {
            System.out.println("Lista vazia ");
            return;
        }
        System.out.println("dados na lista: ");
        No aux = inicio;
        while (aux != null) {
            System.out.println(aux.getDado());
            aux = aux.getProxNo();
        }
        System.out.println();
    }
}