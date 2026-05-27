package App7;

public class Main {
    public static void main(String[] args) {
        MediaAluno aluno = new MediaAluno("João", 7, 8, 9);
        System.out.println(aluno.imprimir());
        System.out.println();

        MediaAluno aluno2 = new MediaAluno("Maria", 5, 1, 10);
        System.out.println(aluno2.imprimir());
    }
}
