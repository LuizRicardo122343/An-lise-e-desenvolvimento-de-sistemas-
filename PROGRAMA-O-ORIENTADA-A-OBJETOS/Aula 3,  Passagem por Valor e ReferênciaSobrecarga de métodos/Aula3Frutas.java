import java.util.ArrayList;

public class Aula3Frutas {

    public static boolean pesquisar(String[] frutas, String fruta) {
        for (String f : frutas) {
            if (f.equalsIgnoreCase(fruta)) {
                return true;
            }
        }
        return false;
    }

    public static String pesquisar(String[] frutas, int indice) {
        if (indice >= 0 && indice < frutas.length) {
            return frutas[indice];
        } else {
            return null;
        }
    }

    public static String[] pesquisar(String[] frutas, char inicial) {
        ArrayList<String> resultado = new ArrayList<>();
        for (String f : frutas) {
            if (f.charAt(0) == inicial) {
                resultado.add(f);
            }
        }
        return resultado.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] frutas = {"carambola", "maçã", "pera", "uva", "laranja", "goiaba", "ameixa",
                            "mamão", "melancia", "framboesa", "pitanga", "açaí", "graviola", 
                            "banana", "maracujá"};

        // Testes
        System.out.println(pesquisar(frutas, "maçã")); // true
        System.out.println(pesquisar(frutas, 3)); // uva
        System.out.println(pesquisar(frutas, 20)); // null

        String[] resultado = pesquisar(frutas, 'm');
        for (String r : resultado) {
            System.out.println(r);
        }
    }
}
