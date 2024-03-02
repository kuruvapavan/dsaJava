public class MinAndMax {
    public static void main(String[] args) {
        int[] arr = {1,4,3,-5,-4,8,6};
        int n = arr.length;
        System.out.println(findMin(arr,n));
        System.out.println(findMax(arr,n));
    }
    static int findMin(int[] arr, int n){
        if (n==1){
            return arr[0];
        }

        return Math.min(arr[n-1],findMin(arr,n-1));
    }
    static int findMax(int[] arr, int n){
        if (n==1){
            return arr[0];
        }
        return Math.max(arr[n-1],findMax(arr,n-1));
    }
    }

