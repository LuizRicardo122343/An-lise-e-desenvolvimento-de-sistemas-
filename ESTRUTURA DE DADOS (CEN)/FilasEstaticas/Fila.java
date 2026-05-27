package FilasEstaticas;

public class Fila{
    private int vetorFila[];
    private int fim;

    //Construtor
    public Fila(int maxSize){
        vetorFila = new int [maxSize];
        fim = -1;
    }
    // Métodos das operações da fila
    //Verifica se a fila estática está cheia
    public boolean isFull(){
        if (fim == this.vetorFila.length - 1){
            System.out.println("Fila cheia");
            return true;
        }else{
            System.out.println("Fila nao cheia");
            return false;

        }
    }
    //insere na fila está estatica
    public void enqueue(int j){
        if (fim < this.vetorFila.length - 1){
            fim = fim +1;
            vetorFila[fim] = j;
        }
    }
    //Verifica se a fila estática está vazia
    public boolean isEmpty(){
        if (fim == -1){
            System.out.println("Fila vazia");
            return true;
        }else{
            System.out.println("Fila nao vazia");
            return false;
        }
    }
    
    //Remove da fila Estática
    public int dequeue(){
        int n;
        if (vetorFila[0] != -1){ // se fila não está vazia
            n = vetorFila[0]; // salva o elemento no início da fila
            for (int i = 0; i < fim; i++){ // desloca os elementos para a esquerda
            vetorFila[i] = vetorFila[i + 1];
        }
            fim = fim - 1; // decrementa o índice de fim
            return n; // retorna o elemento removido
            
        } else { // se fila está vazia
            System.out.println("Fila vazia");
            return -1; // retorna -1 para indicar que a fila está vazia

        }
    }

    //Retorna o primeiro do topo da fila
    public int peek(){
        if (vetorFila[0] != -1) { // se fila não está vazia
            return vetorFila[0]; // retorna o elemento no início da fila
        } else { // se fila está vazia
            return -1; // retorna -1 para indicar que a fila está vazia
        }
    }
    public String show(){
        String retorno = " fim -> ";
        for (int i = 0; i < fim + 1; i++){
            retorno += vetorFila[i] + "";
        }
        return retorno;
    }
}