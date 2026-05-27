//1 –Faça  um  programa  que  solicite  login  e  senha,  simulando  o  acesso  a  um sistema.  
//Considere  que  os  conteúdos  de  login  e  senha  originais  são  iguais  a “java8”.
// O usuário deverá fornecer login e senha e você irá compará-los com os conteúdos  originais.  
//O  usuário tem  três  chances  para  digitar  corretamente  os dados  de  login  e  senha.  
//Para  cada  tentativa  incorreta  deve  aparecer  uma mensagem alertando o erro e apresentando a quantidade de tentativas que ainda restam
import java.util.Scanner;

public class SistemaLogin {
    private final String LOGIN_CORRETO = "java8";
    private final String SENHA_CORRETA = "java8";

    public boolean verificarLogin(String login, String senha) {
        return login.equals(LOGIN_CORRETO) && senha.equals(SENHA_CORRETA);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaLogin sistema = new SistemaLogin();

        int tentativas = 3;

        while (tentativas > 0) {
            System.out.print("Digite o login: ");
            String login = sc.nextLine();

            System.out.print("Digite a senha: ");
            String senha = sc.nextLine();

            if (sistema.verificarLogin(login, senha)) {
                System.out.println("Acesso permitido!");
                break;
            } else {
                tentativas--;
                System.out.println("Login ou senha incorretos.");
                if (tentativas > 0) {
                    System.out.println("Tentativas restantes: " + tentativas);
                } else {
                    System.out.println("Acesso bloqueado!");
                }
            }
        }

        sc.close();
    }
}

