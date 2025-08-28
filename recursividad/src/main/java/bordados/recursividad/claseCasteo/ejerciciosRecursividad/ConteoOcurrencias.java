package bordados.recursividad.claseCasteo.ejerciciosRecursividad;

public class ConteoOcurrencias {
    public static void main(String[] args) {
        int [] datos = {1,2,3,4,5,6,7,8,9,10,1,1,1,1};
        int contador = 0;
        int i = 0;
        int numero = 100;
        System.out.println(contarVeces(datos,contador,i, numero));
    }

    public static int contarVeces(int[] datos, int contador, int i, int numero) {
        if (i == datos.length) {
            return 0;
        }
        if (datos[i] == numero){

            return  contador + 1 + contarVeces(datos, contador, i + 1, numero);
        }else {
            return contarVeces(datos, contador, i + 1, numero);
        }
    }

}
