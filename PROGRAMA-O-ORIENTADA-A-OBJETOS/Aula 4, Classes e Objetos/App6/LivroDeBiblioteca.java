package App6;

public class LivroDeBiblioteca extends Livro {
    private boolean emprestado;

    // Construtor
    public LivroDeBiblioteca(String titulo, String autor, int ano, boolean emprestado) {
        super(titulo, autor, ano); // chama o construtor da superclasse Livro
        this.emprestado = emprestado;
    }

    // M�todo para emprestar o livro
    public void emprestar() {
        emprestado = true;
    }

    // M�todo para devolver o livro
    public void devolver() {
        emprestado = false;
    }

    // M�todo para verificar se est� emprestado
    public boolean isEmprestado() {
        return emprestado;
    }

    // Sobrescrever o m�todo imprimir
    @Override
    public String imprimir() {
        return super.toString() + "\nEmprestado: " + (emprestado ? "Sim" : "Não");
        
    }
}
