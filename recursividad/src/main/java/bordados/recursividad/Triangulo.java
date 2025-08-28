package bordados.recursividad;

public class Triangulo {

    public static void main(String[] args) {
        System.out.println(piramide(2));
    }

    public static String piramide(int n) {
        String resultado = "";

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                resultado += " ";
            }


            for (int j = 1; j <= (2 * i - 1); j++) {
                resultado += "X";
            }


            resultado += "\n";
        }

        return resultado;
    }


}
