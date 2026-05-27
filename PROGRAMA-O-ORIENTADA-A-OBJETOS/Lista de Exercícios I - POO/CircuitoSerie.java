//2 –Na  área  da  eletrônica, 
// em  um  circuito  em  série  temos  que  a  resistência equivalente (total)  desse  circuito  é  obtida   mediante  a  soma  de  todas  as resistências existentes (re= r1 + r2 + ... +rn).
//Faça um programa que receba o valor de 10resistências ligadas em série,
// calcule e mostre a resistência equivalente, 
//a maior e a menor resistência. (usar vetor para armazenar as resistências).
import java.util.Scanner;

public class CircuitoSerie {
    private double[] resistencias;

    public CircuitoSerie(int quantidade) {
        resistencias = new double[quantidade];
    }

    public void lerResistencias() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < resistencias.length; i++) {
            System.out.print("Digite o valor da resistência " + (i + 1) + ": ");
            resistencias[i] = sc.nextDouble();
        }
    }

    public double calcularResistenciaEquivalente() {
        double soma = 0;
        for (double r : resistencias) {
            soma += r;
        }
        return soma;
    }

    public double encontrarMaior() {
        double maior = resistencias[0];
        for (double r : resistencias) {
            if (r > maior) {
                maior = r;
            }
        }
        return maior;
    }

    public double encontrarMenor() {
        double menor = resistencias[0];
        for (double r : resistencias) {
            if (r < menor) {
                menor = r;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        CircuitoSerie circuito = new CircuitoSerie(10);
        circuito.lerResistencias();

        System.out.println("Resistência Equivalente: " + circuito.calcularResistenciaEquivalente());
        System.out.println("Maior resistência: " + circuito.encontrarMaior());
        System.out.println("Menor resistência: " + circuito.encontrarMenor());
    }
}
