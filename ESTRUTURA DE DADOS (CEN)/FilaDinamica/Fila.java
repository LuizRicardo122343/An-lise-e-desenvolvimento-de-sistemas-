package FilaDinamica;

public class Fila {

    private No inicio, fim;

    public Fila(){
        inicio = fim = null;
    }
    // Metodos das operaçṍes da fila
    public void enqueue(int dado) {
        // inserir no fim da fila
        No novo = new No(dado);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.setProxNo(novo);
            fim = novo;
        }
    }
    public boolean isEmpty(){
        //verificar se a fila está vazoa
        if (inicio == null)
            return true;
        else
            return false;
    }
    public int dequeue(){
        //remover o primeiro elemento da fila
        if(isEmpty()){
            //se estiver vazia retorna -1
            return -1;
        }else{
            // utilizado para retornar o dado
            No temp = inicio;
            // move o topo para o próximo nó
            inicio = inicio.getProxNo();
            if ( inicio == null){
                fim = null;
            }
            return temp.getDado();
        }
    }
    public int peek(){
        if(isEmpty()){
            // se estiver vazia retorna -1
            return -1;
        }else
            return inicio.getDado();
    }
    public int size(){
        int cont = 0;
        No temp = inicio;
        while(temp != null){
            cont++;
            temp = temp.getProxNo();
        }
        return cont;
    }
    //Mostrar os elementos em uma String
    public String show(){
        String saida = "null -> ";
        if (isEmpty()){
            return saida;
        }
        else{
            No temp = inicio;
            while(temp != null){
                saida += temp.getDado() + "";
                temp = temp.getProxNo();
            }
            return saida;
        }
    }
}