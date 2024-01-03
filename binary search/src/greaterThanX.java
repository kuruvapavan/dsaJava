import java.util.Arrays;

public class greaterThanX {
    public static void main(String[] args) {
        int[] nums ={3,5};
        System.out.println(Arrays.toString(new int[]{specialArray(nums)}));
    }
    public static int specialArray(int[] nums){
        int n= nums.length;

        int start=1;
        int end=n;
        while (start<=end){
            int mid = start + (end - start) / 2;
            int greater=greatThanX(nums,mid);

            if (mid==greater){
                return mid;
            } else if (mid<greater) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
    static int greatThanX(int[] num,int x){
        int count=0;
        for (int i:
             num) {
            if (i>=x){
                count++;
            }

        }
        return count;
    }
}
