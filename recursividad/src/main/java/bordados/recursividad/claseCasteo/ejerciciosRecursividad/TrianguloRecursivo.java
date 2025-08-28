package bordados.recursividad.claseCasteo.ejerciciosRecursividad;

    public class TrianguloRecursivo {

        public static void main(String[] args) {
            System.out.println(piramide(4));
        }
        
        public static String piramide(int n) {
            if (n == 0) {
                return "";
            }

            String anterior = piramide(n - 1);

            String fila = " ".repeat(n - 1) + "X".repeat(2 * n - 1) + " ".repeat(n-1) + "\n";

            return anterior + fila;
        }

    }




