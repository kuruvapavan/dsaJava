import java.util.Scanner;

public class multiDimension {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
         */
//        int[][] arr = new int[3][];--------->2D array

//        int[][] arr2D= {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//        };
        Scanner in = new Scanner(System.in);

// input
        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        for (int row = 0; row <arr.length ; row++) {
//            for each loop in every row
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col]=in.nextInt();
            }
        }
//        output

        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                System.out.println(arr[row][col]+" ");
            }
            System.out.println();
        }

    }
}
