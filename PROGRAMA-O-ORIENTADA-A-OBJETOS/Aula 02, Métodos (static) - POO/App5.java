//Exercícios•3 –Escreva  o método exibirMes()que receba um número inteiro  e 
// imprima  o mês correspondente  ao número. Por exemplo, 2 corresponde à “fevereiro”. 
// O procedimento deve  mostrar uma mensagem de erro caso o número recebido não faça sentido. 
// •Usar o swich..casecomo estrutura  de decisão

public class App5 {

    public static void exibirMes(int numeroMes) {
        switch (numeroMes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Erro: número de mês inválido.");
        }
    }

    public static void main(String[] args) {
        exibirMes(2);  // Exibe: Fevereiro
        exibirMes(13); // Exibe: Erro
    }
}