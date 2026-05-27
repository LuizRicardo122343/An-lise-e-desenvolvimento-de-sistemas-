//3 –Crie um programa que armazene os 12 meses do ano em um vetor.
//  A seguir, gere um valor aleatório entre 0 e 11 e apresente o mês correspondente ao valor sorteado.
//  Considere que o valor 0 corresponde ao mês de janeiro e o valor 11, ao mês de dezembro.

import java.util.Random;

public class SorteioMes {
    private String[] meses;

    public SorteioMes() {
        meses = new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    }

    public String sortearMes() {
        Random rand = new Random();
        int indice = rand.nextInt(12); // 0 a 11
        return meses[indice];
    }

    public static void main(String[] args) {
        SorteioMes sorteio = new SorteioMes();
        System.out.println("Mês sorteado: " + sorteio.sortearMes());
    }
}

