import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr ={9,8,1,12,3,5,4,3,6,1,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i <arr.length ; i++) {
            swapped=false;
            //for each step, max element   will come at the  last respective index
            for (int j = 1; j < arr.length-i ; j++) {
                //swap the item if the element is smaller than pervious element
                if (arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            //if you did not swap for a particular value of i  , it means the array is sorted, stop the program
            if (!swapped){
                break;
            }
        }
    }
}
