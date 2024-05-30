//import java.util.Arrays;
//
//public class Robber2 {
//    public static int rob(int[] nums) {
//        //return helper(nums,0);
//        int n = nums.length;
//        return helperDP(nums,n);
//    }
//
//    private static int helperDP(int[] nums, int index) {
//       int[] dp = new int[index];
//        Arrays.fill(dp,-1);
//        return dp(index-1,nums,dp);
//    }
//
//    private static int dp(int i, int[] nums, int[] dp) {
//        if (i<0){
//            return 0;
//        }
//        if(i==0){
//            return nums[i];
//        }
//        if(dp[i]!=-1)
//        {
//            return dp[i];
//        }
//        int pick=dp[i]+dp(i-2,nums,dp);
//        int notPick=dp(i-1,nums,dp);
//
//        return Math.max(pick,notPick);
//    }
//
////    private static int helper(int[] nums, int index) {
////
////        if (index>=nums.length)
////        {
////            return 0;
////        }
////        int pick=nums[index]+helper(nums,index+2);
////        int notPick=helper(nums,index+1);
////
////        return Math.max(pick,notPick);
////    }
//
//    public static void main(String[] args) {
//        int[] nums={1,2,3,1};
//        System.out.println(rob(nums));
//    }
//
//}
public class Robber {
    static int rob(int[] nums)
    {
        int n=nums.length;
       // int[] dp = new int[n];

        //Arrays.fill(dp,-1);

        //return  helper(n-1,nums,dp);
        return solve(n,nums);
    }

//    private static int helper(int index, int[] nums, int[] dp) {
//        if (index<0){
//            return 0;
//        }
//        if (index==0){
//            return nums[index];
//        }
//        if (dp[index]!=-1)
//        {
//            return dp[index];
//        }
//
//        int pick= nums[index]+helper(index-2,nums,dp);
//        int notPick=helper(index-1,nums,dp);
//
//        return dp[index]=Math.max(pick,notPick);
//    }
    static int solve(int n, int[] nums){
        int prev=nums[0];
        int prev2=0;

        for (int i = 1; i <n ; i++) {
            int pick=nums[i];

            if (i>1)
            {
                pick=pick+prev2;
            }
            int notPick=prev;

            int curri=Math.max(pick,notPick);
            prev2=prev;
            prev=curri;
        }
        return prev;
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,1};
        System.out.println(rob(nums));
    }
}

