import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={4,3,2,1};
       bubblesort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
//    static void bubble(int[] arr, int r, int c){
//        if (r==0){
//            return;
//        }
//        if (c<r){
//            if (arr[c]>arr[c+1]){
//                int temp=arr[c];
//                arr[c]=arr[c+1];
//                arr[c+1]=temp;
//            }
//            bubble(arr,r,c+1);
//        }
//        else {
//            bubble(arr,r-1,0);
//        }
//    }
    static void bubblesort(int[] arr, int n){
        if (n==1){
            return;
        }
        for (int i = 0; i <n-1 ; i++) {
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubblesort(arr,n-1);
    }
}
