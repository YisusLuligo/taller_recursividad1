package bordados.recursividad.claseCasteo.ejerciciosRecursividad;

public class SumaProducto {

    public static void main(String[] args) {

        System.out.println(suma(-4,-4));
        System.out.println(suma(4,-4));
        System.out.println(suma(-4,4));
    }

    public static int suma(int veces, int valor){
        if (veces == 0){
            return 0;
        }
        if (veces > 0){
            return valor + suma(veces - 1, valor);
        }else {


        if (valor <0)  {
             return  -valor + suma(-veces-1, -valor);
        } else {
            return valor +suma(veces+1, valor);
        }

    }
}
}
