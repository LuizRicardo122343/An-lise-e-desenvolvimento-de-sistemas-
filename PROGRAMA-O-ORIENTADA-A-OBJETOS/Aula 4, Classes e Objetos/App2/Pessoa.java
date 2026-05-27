package App2;

public class Pessoa {

    // Atributos
    String nome;
    int idade;
    char sexo;

    // Métodos
    void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }

    void fazerAniversario() {
        idade++;
    }
}
