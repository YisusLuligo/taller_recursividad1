package bordados.recursividad.claseCasteo.ejerciciosRecursividad;

public class ListaEncontrarN {
    public static void main(String[] args) {
        int numero = 10;
        int [] datos = {2,3,4,5,6,7,8,1,9};
        int posicion = 0;
        System.out.println(encontrarN(numero,datos, posicion));
    }

    public static String encontrarN(int numero, int[] datos, int posicion) {
        if (datos.length == posicion) {
            return "No esta";
        }
        if (numero == datos[posicion])  {
            return "Numero encontrado en la posicion " + posicion;
        }else {
            return encontrarN(numero, datos, posicion+1);
        }
    }
}
