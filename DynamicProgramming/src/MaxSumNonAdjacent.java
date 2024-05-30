import java.time.chrono.MinguoChronology;
import java.util.Arrays;

public class MaxSumNonAdjacent {
    public static void main(String[] args) {
        int[] nums={2,1,4,9};
        int n= nums.length;
        System.out.println(maxSum(nums,0));
        System.out.println(maxsumDP(n,nums));

    }
    static int maxSum(int[] nums,int index){
        if (index>=nums.length){
            return 0;
        }
        int pick=nums[index]+maxSum(nums,index+2);
        int notPick=maxSum(nums,index+1);

        return Math.max(pick,notPick);
    }
static int maxsumDP(int n, int[] arr)
{
    int[] dp= new int[n];

    Arrays.fill(dp,-1);

    return maxSumdp(n-1,arr,dp);
}

    private static int maxSumdp(int index, int[] arr, int[] dp) {
        if (index<0)
        {
            return 0;
        }
        if (index==0){
            return arr[index];
        }
        if(dp[index]!=-1)
        {
            return dp[index];

        }
        int pick=arr[index]+maxSumdp(index-2,arr,dp);
        int notPick=maxSumdp(index-1,arr,dp);

        return dp[index]=Math.max(pick,notPick);
    }

}
