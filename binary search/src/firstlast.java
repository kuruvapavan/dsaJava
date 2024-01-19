import java.util.Arrays;

public class firstlast {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=8;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }
    public static int[] searchRange(int[] nums, int target){
        int f=first(nums,target);
        int l=last(nums,target);
        return new int[]{f,l};
    }
    public static int first(int[] arr, int target){
        int s=0;
        int e=arr.length-1;
        int fir=-1;
        while (s<=e){
            int m = s+ (e-s)/2;
            if (target<arr[m]){
                e=m-1;
            } else if(target>arr[m]){
                s=m+1;
            }else {
                fir=m;
                e=m-1;
            }
        }
        return fir;
    }
    public static int last(int[] arr, int target){
        int s =0;
        int e =arr.length-1;
        int last=-1;
        while (s<=e){
            int m = s + (e-s)/2;
            if (target<arr[m]){
                e=m-1;
            }else if(target>arr[m]){
                s=m+1;
            }else {
                last=m;
                s=m+1;
            }
        }
        return last;
    }
}
