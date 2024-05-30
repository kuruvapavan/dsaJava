import java.util.Arrays;

class uniquePaths {
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int[] row:
             dp) {
            Arrays.fill(row,-1);
        }
        return countWays(m-1,n-1,dp);
        
    }

    private static int countWays(int i, int j, int[][] dp) {
        if (i==0 && j==0)
        {
            return 1;
        }
        if(i<0 || j<0)
        {
            return 0;
        }
        if (dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int up = countWays(i-1,j,dp);
        int left=countWays(i,j-1,dp);

        return dp[i][j]=up+left;
    }

    public static void main(String[] args) {
        int m=3;
        int n=7;

        System.out.println(uniquePaths(m,n));
        System.out.println(uniquePathsTabulation(m,n));
    }
    public static int uniquePathsTabulation(int m, int n)
    {
        int[][] dp = new int[m][n];
        for (int[] row:
             dp) {
            Arrays.fill(row,-1);
        }
        return countWaysTabulation(m,n,dp);
    }

    private static int countWaysTabulation(int m, int n, int[][] dp) {

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (i==0 &&j==0)
                {
                    dp[i][j]=1;
                    continue;
                }

                int up =0;
                int left=0;

                if(i>0){
                    up=dp[i-1][j];
                }
                if (j>0)
                {
                    left=dp[i][j-1];
                }

                dp[i][j]=up+left;
            }
        }
        return dp[m-1][n-1];

    }
}