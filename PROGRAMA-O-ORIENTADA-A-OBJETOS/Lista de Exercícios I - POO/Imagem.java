//4 –Uma imagem é formada por pixels. 
//Considere uma imagem com dimensão de 40 x 40 e faça um programa que contenha uma matriz com essas dimensões. 
//A seguir, para cada posição desse array armazene um valor aleatório entre 0 e 255 (esses   valores   correspondem   às   tonalidades   aplicadas   sobre   a   imagem). 
// Apresente em tela os 1600 valores gerados.
import java.util.Random;

public class Imagem {
    private int[][] pixels;
    private int largura;
    private int altura;

    public Imagem(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
        pixels = new int[altura][largura];  // altura x largura
    }

    public void gerarPixels() {
        Random rand = new Random();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                pixels[i][j] = rand.nextInt(256); // 0 a 255
            }
        }
    }

    public void exibirPixels() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print(pixels[i][j] + " ");
            }
            System.out.println();  // Quebra de linha por linha
        }
    }

    public static void main(String[] args) {
        Imagem img = new Imagem(40, 40);
        img.gerarPixels();
        img.exibirPixels();
    }
}
