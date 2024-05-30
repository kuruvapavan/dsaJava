import java.util.Arrays;

public class triangle {
    public static int minimumPathSum(int[][] triangle, int n) {
        // Write your code here.
        int[][] dp = new int[n][n];

        for (int[] row:
             dp) {
            Arrays.fill(row,-1);
        }
        return memo(triangle,0,0,dp,n);
    }

    private static int memo(int[][] triangle, int i, int j, int[][] dp,int n) {
        if (dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if (i==n-1){
            return triangle[i][j];
        }
        int down=triangle[i][j]+memo(triangle,i+1,j,dp,n);
        int diagonal=triangle[i][j]+memo(triangle,i+1,j+1,dp,n);

        return dp[i][j]=Math.min(down,diagonal);
    }
}