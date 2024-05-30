import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

public class FrogJump {
    public static void main(String[] args) {
        int[] height = {30, 10, 60, 10, 60, 50};
        int s = height.length;
        int dp[] = new int[s];
        Arrays.fill(dp, -1);
        System.out.println(frogjump(s, height));
    }

    static int frogjump(int n, int heights[]) {
//        int[] dp= new int[n+1];
//
//        Arrays.fill(dp,-1);
//        dp[0]=0;
//        for(int ind=1;ind<n;ind++){
//            int jumpTwo = Integer.MAX_VALUE;
//            int jumpOne= dp[ind-1] + Math.abs(heights[ind]-heights[ind-1]);
//            if(ind>1)
//                jumpTwo = dp[ind-2] + Math.abs(heights[ind]-heights[ind-2]);
//
//            dp[ind]=Math.min(jumpOne, jumpTwo);
//        }
//        return dp[n-1];

        //return helper(n-1,heights,dp);
        int prev = 0;
        int prev2 = 0;
        for (int i = 1; i < n; i++) {
            int jumpTwo = Integer.MAX_VALUE;
            int jumpOne = prev + Math.abs(heights[i] - heights[i - 1]);
            if (i > 1) {
                jumpTwo = prev2 + Math.abs(heights[i] - heights[i - 2]);
            }
            int curI = Math.min(jumpOne, jumpTwo);
            prev2 = prev;
            prev = curI;
        }

        System.out.println(prev);


//    static int helper(int index,int[] height, int[] dp){
//        if (index==0){
//            return 0;
//        }
//        if(dp[index]!=-1){
//            return dp[index];
//        }
//        int jumpTwo=Integer.MAX_VALUE;
//        int jumpOne=helper(index-1,height,dp)+Math.abs(height[index]-height[index-1]);
//        if(index>1){
//            jumpTwo=helper(index-2,height,dp)+Math.abs(height[index]-height[index-2]);
//        }
//        return dp[index]=Math.min(jumpOne,jumpTwo);
        return prev;
    }
}


