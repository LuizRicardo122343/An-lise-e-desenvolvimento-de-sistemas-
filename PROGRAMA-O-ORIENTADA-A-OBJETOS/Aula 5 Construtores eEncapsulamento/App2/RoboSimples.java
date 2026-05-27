package App2;

public class RoboSimples {
    private char direcao;

    // Construtor com validação
    public RoboSimples(char direcao) {
        setDirecao(direcao); // usa o setter com validação
    }

    // Setter com validação
    public void setDirecao(char direcao) {
        if (direcao == 'N' || direcao == 'S' || direcao == 'L' || direcao == 'O') {
            this.direcao = direcao;
        } else {
            this.direcao = 'N'; // padrão
        }
    }

    // Getter
    public char getDirecao() {
        return direcao;
    }

    // ✅ Método imprimir
    public String imprimir() {
        String texto = switch (direcao) {
            case 'N' -> "Norte";
            case 'S' -> "Sul";
            case 'L' -> "Leste";
            case 'O' -> "Oeste";
            default  -> "Desconhecido";
        };
        return "Direção atual do robô: " + texto;
    }
}
