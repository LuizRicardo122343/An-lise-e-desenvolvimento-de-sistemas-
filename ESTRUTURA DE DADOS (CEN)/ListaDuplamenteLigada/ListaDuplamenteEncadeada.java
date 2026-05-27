package ListaDuplamenteLigada;

public class ListaDuplamenteEncadeada {
    private No firstNo;
    private No lastNo;

    public ListaDuplamenteEncadeada() {
        firstNo = lastNo = null;
    }
    public boolean isEmpty() {
        return (firstNo == null);
    }
    public void insereNoComeco(int dd) {
        No novoNo = new No(dd);
        if (isEmpty()) {
            firstNo = lastNo = novoNo;
        } else {
            firstNo.setAnteriorNo(novoNo);
            novoNo.setProximoNo(firstNo);
            firstNo = novoNo;
        }
    }
    public void insereNoFim(int dd) {
        No novoNo = new No(dd);
        if (isEmpty()) {
            firstNo = lastNo = novoNo;
        } else {
            lastNo.setProximoNo(novoNo);
            novoNo.setAnteriorNo(lastNo);
            lastNo = novoNo;
        }
    }
    public boolean insertDepois(int key, int dd) {
        No atual = firstNo;
        if (atual == null) {
            return false;
        }
        while (atual.getDado() != key) {
            atual = atual.getProximoNo();
            if (atual == null) {
                return false;
            }
        }
        No novoNo = new No(dd);
        if (atual == lastNo) {
            novoNo.setProximoNo(null);
            lastNo = novoNo;
        }
        else {
            novoNo.setProximoNo(atual.getProximoNo());
            atual.getProximoNo().setAnteriorNo(novoNo);
        }
        novoNo.setAnteriorNo(atual);
        atual.setProximoNo(novoNo);
        return true;
    }
    public No deleteFirst(){
        No temp = lastNo;
        if (firstNo == null) {
            return null;
        }
        if (firstNo.getProximoNo() == null) {
            firstNo = lastNo = null;
        } else {
            lastNo.getAnteriorNo().setProximoNo(null);
            lastNo = lastNo.getAnteriorNo();
        }
        return temp;
    }
    public No deleteKey(int key) {
        No atual = firstNo;
        if (atual == null) {
            return null;
        }
        while (atual.getDado() != key) {
            atual = atual.getProximoNo();
            if (atual == null) {
                return null; // não achou
            }
        }
        if (atual == firstNo) {
            firstNo = atual.getProximoNo();
        } else {
            atual.getAnteriorNo().setProximoNo(atual.getProximoNo());
        }
        if (atual == lastNo) {
            lastNo = atual.getAnteriorNo();
        } else {
            atual.getProximoNo().setAnteriorNo(atual.getAnteriorNo());
        }
        return atual;
    }
    public No deleteLast(){
        No temp = lastNo;
        if (firstNo == null) {
            return null;
        }
        if (firstNo.getProximoNo() == null) {
            firstNo = lastNo = null;
        } else {
            lastNo.getProximoNo().setAnteriorNo(null);
            lastNo = lastNo.getProximoNo();
        }
        return temp;
    }
    
    public void displayForward(){
        System.out.println("Lista: ");
        No atual = firstNo;
        while (atual != null) {
            System.out.print(atual.getDado() + " ");
            atual = atual.getProximoNo();
        }
        System.out.println();
    }
    public void displayBackward(){
        System.out.println("Lista inversa: ");
        No atual = lastNo;
        while (atual != null) {
            System.out.print(atual.getDado() + " ");
            atual = atual.getAnteriorNo();
        }
        System.out.println();
    }
}