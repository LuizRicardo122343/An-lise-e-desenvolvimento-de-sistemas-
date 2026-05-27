package App2;

public class Principal {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.nome = "João";
        p.idade = 30;
        p.sexo = 'M';

        p.imprimirDados();

        p.fazerAniversario();

        p.imprimirDados();

    }
}
