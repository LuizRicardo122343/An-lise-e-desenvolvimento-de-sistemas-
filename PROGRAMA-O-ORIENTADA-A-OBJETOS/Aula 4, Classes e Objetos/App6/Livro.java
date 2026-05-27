package App6;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    
    public Livro() {

    }
    // Construtor
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }
    // Método imprimir
    public String imprimir() {
        return "\nTítulo: " + titulo + "\nAutor: " + autor + "\nAno: " + ano + "\n";
    }
}
