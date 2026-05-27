package PilhasDinamicas;

public class Pilha {
    private No topo;
    //construtor
    public Pilha(){
        this.topo = null;
    }
    //Métodos push(), pop(), isEmpty(), display() 
    public void push(int dado){
        //cria um novo nó
        No novoNo = new No(dado);
        novoNo.setProxNo (this.topo);
        this.topo = novoNo;
    } 
    public boolean isEmpty(){
        //true se a lista está vazia
        return (this.topo == null);
    }
    public int pop(){
        //se estiver vazia retorna -1
        if(isEmpty()){
            return -1;
        }
        // utilizado para retornar o dado
        No temp = topo;
        //move o topo para o prox nó 
        topo = topo.getProxNo();
        //retorna o dado
        return temp.getDado();
    }
    public int size(){
        //conta quantos nó existem
        No auxiliar;
        auxiliar = this.topo;
        int cont = 0;
        while(auxiliar != null){
            auxiliar = auxiliar.getProxNo();
            cont++;
        }
        return cont;
    }
    public int peek(){
        //se estiver vazia retorna -1
        if (isEmpty()){
            return -1;
        }
        return this.topo.getDado();
    }
    public String display(){
        //mostra o conteúdo da pilha
        String retorno = "";
        if (isEmpty()) {
            retorno += "Pilha vazia";
        } else {
            No atual = this.topo;
            //inicia do topo
            while (atual != null) {
                //até do final
                retorno += atual.getDado() + " ";
                atual = atual.getProxNo();
            }
        }
        return retorno;
    }
}