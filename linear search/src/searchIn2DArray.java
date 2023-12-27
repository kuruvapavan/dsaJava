import java.lang.reflect.Array;
import java.util.Arrays;

public class searchIn2DArray {

    public static void main(String[] args) {
    int[][] arr={
            {23,3,1},
            {44,65,10,15},
            {34,9,22}
    };
    int target=10;
       int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] search(int[][] arr, int target) {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }

            }

        }
    return new int[]{-1,-1};
    }

}
