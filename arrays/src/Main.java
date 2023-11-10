import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner in = new Scanner(System.in);
//
//        int[] arr= new int[5];
//        arr[0]=23;
//        arr[1]=11;
//        arr[2]=33;
//        arr[3]=23;
//        arr[4]=65;
//        System.out.println(arr[3]);

// using for loop
//        for (int i=0;i<5;i++){
//            arr[i]=in.nextInt();
//            System.out.println(arr[i]);
//        }

//        array of objects

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}