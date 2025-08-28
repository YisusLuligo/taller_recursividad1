package bordados.recursividad.claseCasteo.ejerciciosRecursividad;

public class SumaTotalLista {
    public static void main(String[] args) {
        int [] nums= {1,2,3,4,5};
        int i =0;
        System.out.println(sumaLista(nums,i));
    }

    public static int sumaLista(int[] nums,int i) {
        int n = 0;
        if (nums.length == i) {
            return 0;
        }else {
            return nums[i] + sumaLista(nums,i+1);
        }

    }
}
