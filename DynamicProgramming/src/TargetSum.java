import java.util.Arrays;

class TargetSum {

    public static int findTargetSumWays(int[] nums, int target)
    {
        int n=nums.length;
        int totalSum=0;

        for (int i = 0; i <n; i++) {
            totalSum+=nums[i];
        }

        if (totalSum-target<0)
        {
            return 0;
        }
        if((totalSum-target)%2==1)
        {
            return 0;
        }
        int s2= (totalSum-target)/2;

        int[][] dp = new int[n][s2+1];

        for (int[] r:
             dp) {
            Arrays.fill(r,-1);
        }
        return targetsum(n-1,s2,nums,dp);
    }

    private static int targetsum(int ind, int target, int[] nums, int[][] dp) {
        if (ind==0)
            if (target==0 && nums[0]==0)
                return 2;
            if (target==0 || target==nums[0])
                return 1;
        if (dp[ind][target]!=-1)
            return dp[ind][target];

        int notTaken=targetsum(ind-1,target,nums,dp);

        int taken=0;

        if (nums[ind]<=target)
            taken=targetsum(ind-1,target-nums[ind],nums,dp);
        return dp[ind][target]=(taken+notTaken);
    }

    public static void main(String[] args) {
        int[] nums={1,1,1,1,1};
        int target=3;
        System.out.println(findTargetSumWays(nums,
                target));
    }
}