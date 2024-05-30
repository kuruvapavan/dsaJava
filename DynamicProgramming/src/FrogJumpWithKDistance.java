import java.util.Arrays;
import java.util.Map;

public class FrogJumpWithKDistance {

     static int solve(int n, int[] height, int k){
        int[] dp = new int[n];
         Arrays.fill(dp,-1);
         return solveUtil(n-1,height,dp,k);
     }

    private static int solveUtil(int index, int[] height, int[] dp, int k) {
        if (index==0){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int minSteps=Integer.MAX_VALUE;

        for (int j = 1; j <=k ; j++) {
            if (index-j>=0){
                int jump = solveUtil(index-j,height,dp,k)+ Math.abs(height[index]-height[index-j]);
                minSteps=Math.min(jump,minSteps);
            }
        }
        return dp[index]=minSteps;
    }

    public static void main(String[] args) {
        int heigth[]={30, 10, 60, 10, 60, 50 };
        int n=heigth.length;
        int k=2;
        System.out.println(solve(n,heigth,k));
        System.out.println(TabulationAprroach(n,heigth,k));

    }
    static int TabulationAprroach(int n, int[] height, int k){
         int[] dp= new int[n];
         Arrays.fill(dp,-1);
         return solveUtilTabulation(n,height,dp,k);
    }

    private static int solveUtilTabulation(int n, int[] height, int[] dp, int k) {
         dp[0]=0;
        for (int i = 1; i < n; i++) {
            int minSteps=Integer.MAX_VALUE;

            for (int j = 1; j <=k ; j++) {
                if (i-j>=0)
                {
                    int jump=dp[i-j]+Math.abs(height[i]-height[i-j]);
                    minSteps=Math.min(jump,minSteps);
                }
            }
            dp[i]=minSteps;
        }
        return dp[n-1];
    }
}
