package App4;

public class Trapezio {
    private double baseMaior;
    private double baseMenor;
    private double altura;

    // Construtor
    public Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    // Getters
    public double getBaseMaior() {
        return baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    // Método para calcular a área
    public double calcularArea() {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    // ✅ Método imprimir
    public String imprimir() {
        return "Trapézio:\n" +
               "- Base maior: " + baseMaior + "\n" +
               "- Base menor: " + baseMenor + "\n" +
               "- Altura: " + altura + "\n" +
               "- Área: " + String.format("%.2f", calcularArea());
    }
}
