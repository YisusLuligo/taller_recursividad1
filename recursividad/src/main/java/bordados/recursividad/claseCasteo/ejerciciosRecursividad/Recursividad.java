package bordados.recursividad.claseCasteo.ejerciciosRecursividad;

public class Recursividad {


        public static void main(String[] args) {
            int[] datos = {2, 5, -3, 10};
            System.out.println(sumar(datos)); // 14
        }
        // Versión pública: valida y delega al helper recursivo
        public static int sumar(int[] lista) {
            return sumarDesde(lista, 0); // empezamos en el índice 0
        }

        // Helper recursivo: suma desde el índice i hasta el final
        private static int sumarDesde(int[] lista, int i) {
            // 1) Caso base: si i llegó al final, no hay nada que sumar
            if (i == lista.length) {
                return 0;
            }
            // 2) Caso recursivo: tomo el elemento actual y sumo el resto
            return lista[i] + sumarDesde(lista, i + 1);
        }

}
