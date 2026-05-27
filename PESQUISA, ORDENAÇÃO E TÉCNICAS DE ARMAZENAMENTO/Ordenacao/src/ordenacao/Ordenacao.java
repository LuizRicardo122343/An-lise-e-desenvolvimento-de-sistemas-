/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao;

import java.util.Arrays;

/**
 *
 * @author pniet
 */
public class Ordenacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetor[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Array antes da ordenação:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        bubbleSort1(vetor);
        bubbleSort2(vetor);
        bubbleSort3(vetor);
        insertionSort(vetor);
        ShellSort(vetor);
        OddEvenSort(vetor);
        cocktailSort(vetor);
        selectionSort(vetor);
        mergeSort(vetor, 0, vetor.length - 1);
        heapSort(vetor);
        quicksort(vetor, 0, vetor.length - 1);
        proceduresort(vetor, vetor);
        countSort(vetor);
        radixSort(vetor);
        
        System.out.println("Array após a ordenação:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

         //maior
        int maior = encontrarMaior(vetor);
        System.out.println("Maior: " + maior);

        //menor
        int menor = encontrarMenor(vetor);
        System.out.println("Menor: " + menor);
        //total
        int total = total(vetor);
        System.out.println("Total: " + total);

        //media
        double media = media(vetor);
        System.out.println("Media: " + media);
        
    }
    public static void bubbleSort1(int[] vetor) {
        boolean invertido;
        do {
            invertido = false;
            for (int i = 1; i < vetor.length; i++) {
                if (vetor[i - 1] > vetor[i]) {
                    int auxiliar = vetor[i - 1];
                    vetor[i - 1] = vetor[i];
                    vetor[i] = auxiliar;
                    invertido = true;
                }
            }
        } while (invertido == true);
    }
    public static void bubbleSort2(int[] vetor) {
        boolean invertido;
        int tamanho = vetor.length;
        do {
            invertido = false;
            for (int i = 1; i < tamanho; i++) {
                if (vetor[i - 1] > vetor[i]) {
                    int auxiliar = vetor[i - 1];
                    vetor[i - 1] = vetor[i];
                    vetor[i] = auxiliar;
                    invertido = true;
                }
            }
            tamanho--;
        } while (invertido == true);
    }
    public static void bubbleSort3(int[] vetor) {
        int tamanho = vetor.length;
        do {
            int novoTamanho = 0;
            for (int i = 1; i < tamanho; i++) {
                if (vetor[i - 1] > vetor[i]) {
                    int auxiliar = vetor[i - 1];
                    vetor[i - 1] = vetor[i];
                    vetor[i] = auxiliar;
                    novoTamanho = i;
                }
            }
            tamanho = novoTamanho;
        } while (tamanho > 0);
    }
    public static void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int j = i;
            while (j > 0 && vetor[j - 1] > vetor[j]) {
                int aux = vetor[j - 1];
                vetor[j - 1] = vetor[j];
                vetor[j] = aux;
                j--;
            }
        }
    }
    public static void ShellSort(int[] vetor) {
        int valor;
        int gap = 1;
        while (gap < vetor.length / 3) {
            gap = 3 * gap + 1;
        }
        while (gap > 1) {
            gap /=3;
            for (int i = gap; i < vetor.length; i++) {
                valor = vetor[i];
                int j = i;
                while (j >= gap && valor < vetor[j - gap]) {
                    vetor[j] = vetor[j - gap];
                    j = j - gap;
                }
                vetor[j] = valor;
            }
        }
    }
    public static void OddEvenSort(int[] vetor) {
        boolean invertido;
            do {
            invertido = false;
            for (int i = 1; i < vetor.length; i++) {
                if (vetor[i - 1] > vetor[i]) {
                int temp = vetor[i - 1];
                vetor[i - 1] = vetor[i];
                vetor[i] = temp;
                invertido = true;
            }
        }
            for (int i = 2; i <= vetor.length; i += 2) {
            if (vetor[i - 1] > vetor[i]) {
                int temp = vetor[i - 1];
                vetor[i - 1] = vetor[i];
                vetor[i] = temp;
                invertido = true;
                }
            }
        } while (invertido == true);
    }
    public static void cocktailSort(int[] vetor) {
        boolean invertido;
        do {
            invertido = false;
            for (int i = 1; i < vetor.length; i++) {
                if (vetor[i - 1] > vetor[i]) {
                    int auxiliar = vetor[i - 1];
                    vetor[i - 1] = vetor[i];
                    vetor[i] = auxiliar;
                    invertido = true;
                }
            }
                if (invertido == false) {
                break;
            }
            invertido = false;
            for (int i = 1; i < vetor.length; i++) {
                if (vetor[i - 1] > vetor[i]) {
                    int auxiliar = vetor[i - 1];
                    vetor[i - 1] = vetor[i];
                    vetor[i] = auxiliar;
                    invertido = true;
                }
            }
        } while (invertido == true);
    }
    public static void selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            if (menor != i) {
                int aux = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = aux;
            }
        }
    }
    public static void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            intercala(vetor, inicio, meio, fim);
        }
    }
    private static void intercala(int[] vetor, int inicio, int meio, int fim) {
        int[] auxiliar = new int[vetor.length];
        for (int i = inicio; i <= meio; i++) {
            auxiliar[i] = vetor[i];
        }
        for (int i = meio + 1; i <= fim; i++) {
            auxiliar[fim + meio + 1 - i] = vetor[i];
        }
        int i = inicio;
        int j = fim;
        for (int k = inicio; k <= fim; k++) {
            if (auxiliar[i] <= auxiliar[j]) {
                vetor[k] = auxiliar[i];
                i++;
            } else {
                vetor[k] = auxiliar[j];
                j--;
            }
        }
    }
    public static void heapSort(int[] vetor) {
        criaHeap(vetor);
        int fim = vetor.length - 1;
        while (fim > 0) {
            int temp = vetor[0];
            vetor[0] = vetor[fim];
            vetor[fim] = temp;
            fim--;
            arrumaHeap(vetor, 0, fim);
        }
    }
    private static void criaHeap(int[] vetor) {
        int inicio = (vetor.length - 2) / 2;
        while (inicio >= 0) {
            arrumaHeap(vetor, inicio, vetor.length - 1);
            inicio--;
        }
    }
    private static void arrumaHeap(int[] vetor, int inicio, int fim) {
        int raiz = inicio;
        while (raiz * 2 + 1 <= fim) {
            int filho = raiz * 2 + 1;
            int trocar = raiz;
            if (vetor[trocar] < vetor[filho]) {
                trocar = filho;
            }
            if (filho + 1 <= fim && vetor[trocar] < vetor[filho + 1]) {
                trocar = filho + 1;
            }
            if (trocar != raiz) {
                int temp = vetor[raiz];
                vetor[raiz] = vetor[trocar];
                vetor[trocar] = temp;
                raiz = trocar;
            } else {
                raiz = fim;
            }
        }
    }
    public static void quicksort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = particionar(vetor, inicio, fim);
            quicksort(vetor, inicio, meio - 1);
            quicksort(vetor, meio + 1, fim);
        }
    }
    private static int particionar(int[] vetor, int inicio, int fim) {
        int i = inicio + 1, j = fim;
        while (i <= j) {
            if (vetor[i] < vetor[inicio]) {
                i++;
            } else {
                if (vetor[j] > vetor[inicio]) {
                    j--;
                } else {
                    int auxiliar = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = auxiliar;
                    i++;
                    j--;
                }
            }
        }
        int auxiliar = vetor[inicio];
        vetor[inicio] = vetor[j];
        vetor[j] = auxiliar;
        return j;
    }
    public static void countSort(int[] vetor) {
        int maior = encontrarMaior(vetor);
        int[] count = new int[maior + 1];
    
        for (int i = 0; i < vetor.length; i++) {
            count[vetor[i]]++;
        }
        int indice = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                vetor[indice] = i;
            indice++;
            count[i]--;
            }
        }
    }
    public static void radixSort(int[] vetor) {
        int max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
            }
        }
    
            for (int exp = 1; max / exp > 0; exp *= 10) {
                countSort(vetor);
            }
        }
    
    public static void selecaoParcial(int[] vetor, int[] K) {
        int i, j, min;
        for (i = 0; i < K.length; i++) {
            min = i;
            for (j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[min]) {
                    min = j;
                }
            }
                int aux = vetor[i];
                vetor[i] = vetor[min];
                vetor[min] = aux;
        }
    }
    public static void proceduresort (int[] vetor, int[] array) {
        int maxDepth = (int) (Math.log(array.length) / Math.log(2)) * 2;
        introsort(vetor, maxDepth);
    }
    public static void introsort(int[] vetor, int maxDepth) {
        int n = vetor.length;
        if (n < 1) {
            return;
        }else if (maxDepth == 0) {
                heapSort(vetor);
            } else {
                int p = partition(vetor);
                introsort(Arrays.copyOfRange(vetor, 0, p), maxDepth - 1);
                introsort(Arrays.copyOfRange(vetor, p + 1, n), maxDepth - 1);
            }
        }
        private static int partition(int[] vetor) {
            int pivot = vetor[0];
            int i = 1;
            int j = vetor.length - 1;
            while (i <= j) {
                while (i <= j && vetor[i] <= pivot) {
                    i++;
                }
                while (i <= j && vetor[j] > pivot) {
                    j--;
                }
                if (i <= j) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                    i++;
                    j--;
                }
            }
            int temp = vetor[0];
            vetor[0] = vetor[j];
            vetor[j] = temp;
            return j; // Retorna o índice do pivô
        }    
    
    public static int encontrarMaior(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
            maior = vetor[i];
            }
        }
        return maior;
    }
    public static int encontrarMenor(int[] vetor) {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
            menor = vetor[i];
            }
        }
        return menor;
    }
    public static int total(int[] vetor) {
        int total = 0;
        for (int i = 0; i < vetor.length; i++) {
            total += vetor[i];
        }
        return total;
        }
    public static double media(int[] vetor) {
        int total = 0;
        for (int i = 0; i < vetor.length; i++) {
            total += vetor[i];
        }
        return (double) total / vetor.length;
    }
}