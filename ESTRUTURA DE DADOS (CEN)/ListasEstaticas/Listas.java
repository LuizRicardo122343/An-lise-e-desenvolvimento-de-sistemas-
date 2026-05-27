package ListasEstaticas;

public class Listas {

    private int tamanho;
    private int vetorLista[];

    public Listas(int maxTamanho) {

        this.tamanho = 0;
        vetorLista = new int[maxTamanho];
    }

    public int add(int pos, int valor) { 
        if (!isFull()) {
            for (int i = tamanho;i > pos; i--) {
                this.vetorLista[i] = this.vetorLista[i - 1];
            }
            this.vetorLista[pos] = valor;
            tamanho++;
            return 0;
        } else {
            System.out.println("A lista está cheia");
            return 1;
        }
    }

    public boolean isFull() {
        return this.tamanho == this.vetorLista.length;
    }


    public boolean isEmpty() {
        return this.tamanho == 0;
    }

    public int remove(int pos) {
        if (!isEmpty()) {
            for (int i = pos; i < this.tamanho - 1; i++) {
                this.vetorLista[i] = this.vetorLista[i + 1];
            }
            tamanho--;
            return 0;
        } else {
            System.out.println("A lista está vazia");
            return 1;
        }
    }

    public void set(int pos, int valor) {
        System.out.println("valor antigo: " + this.vetorLista[pos]);
        this.vetorLista[pos] = valor;
        System.out.println("novo valor: " + this.vetorLista[pos]);
    }

    public int get(int pos) {
        return this.vetorLista[pos];
    }

    public void show() {
        if (!isEmpty()) {
            String mostrar = "";
            for (int i = 0; i < this.tamanho; i++) {
                mostrar = mostrar + "; " + this.vetorLista[i];
            }
            System.out.println("Vetor: " + mostrar);
        } else {
            System.out.println("A lista está vazia.");
        }
    }
}