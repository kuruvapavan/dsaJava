import java.util.Arrays;

public class inPlaceSorting {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        mergesortInplace(nums,0,nums.length);
        System.out.println(Arrays.toString(nums));
    }
    static void mergesortInplace(int[] nums, int start, int end){
        if (end-start==1){
            return ;
        }
        int mid=(start+end)/2;
        mergesortInplace(nums,start,mid);
        mergesortInplace(nums,mid, nums.length);

        mergeInPlace(nums,start, mid,end);
    }

    private static void mergeInPlace(int[] nums, int start, int mid, int end) {
        int[] mix = new int[end-start];

        int i=start;
        int j=mid;
        int k=0;
        while (i<mid && j<end){
            if (nums[i]<nums[j]){
                mix[k]=nums[i];
                i++;
            }else {
                mix[k]=nums[j];
                j++;
            }
            k++;
        }
        while (i<mid){
            mix[k]=nums[i];
            i++;
            k++;
        }
        while (j<end){
            mix[k]=nums[j];
            j++;
            k++;
        }
        for (int l = 0; l <mix.length ; l++) {
            nums[start+l]=mix[l];
        }
    }
}
