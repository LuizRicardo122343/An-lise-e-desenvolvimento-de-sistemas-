package ListaDuplamenteLigada;

public class No {
    private int dado;
    private No proximoNo;
    private No anteriorNo;

    public No(int dd) {
        this.dado = dd;
        anteriorNo = proximoNo = null;
    }
    public int getDado() {
        return dado;
    }
    public void setDado(int dado) {
        this.dado = dado;
    }
    public No getProximoNo() {
        return proximoNo;
    }
    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }
    public No getAnteriorNo() {
        return anteriorNo;
    }
    public void setAnteriorNo(No anteriorNo) {
        this.anteriorNo = anteriorNo;
    }
    @Override
    public String toString() {
        return "dado: " + dado + ", proximoNo: " + proximoNo + ", anteriorNo: " + anteriorNo;
    }
}
