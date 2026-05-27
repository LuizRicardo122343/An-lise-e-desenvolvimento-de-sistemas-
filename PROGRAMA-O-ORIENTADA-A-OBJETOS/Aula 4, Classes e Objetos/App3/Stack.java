package App3;

public class Stack {
    public static void main(String[] args) {
        Pessoa objPessoa = new Pessoa();

        objPessoa.nome = "João";
        objPessoa.idade = 30;
        objPessoa.sexo = 'M';

        System.out.println("nome: " + objPessoa.nome);

        System.out.println(objPessoa.imprimir());
    }
    
}
