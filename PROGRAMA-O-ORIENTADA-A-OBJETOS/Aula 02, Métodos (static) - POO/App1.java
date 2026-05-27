//Exemplo 2 –voide com parâmetro

public class App1 {
    public static void main(String[] args) throws Exception {
        //voide sem par�metros
        imprimirDadosDisciplna("luiz");
    }
    static void imprimirDadosDisciplna(String professor) {
        System.out.println("===================================");
        System.out.println("\tLinguagem de programação");
        System.out.println("\tCarga horaria: 60h");
        System.out.println("\tProfessor: "+professor);
        System.out.println("===================================");
    }
}