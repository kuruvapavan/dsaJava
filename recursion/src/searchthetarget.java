public class searchthetarget {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,3,5,6},5,0));
    }
    static int search(int[] arr, int target, int index){
        if (arr[index]==target)
            return index;
        else
            return search(arr,target,index+1);
    }
}
