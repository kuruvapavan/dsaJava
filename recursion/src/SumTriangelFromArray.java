import java.util.Arrays;

public class SumTriangelFromArray {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        printTriangle(x);
    }
    static void printTriangle(int[] x){
        if (x.length<1){
            return;
        }
        int[] temp = new int[x.length-1];
        for (int i = 0; i <x.length-1 ; i++) {
            int a = x[i]+x[i+1];
            temp[i]=a;
        }
        printTriangle(temp);
        System.out.println(Arrays.toString(x));
    }
    }

