import java.util.ArrayList;
import java.util.Arrays;

public class mazeObstacles {
    static int mazeObstacles(int n, int m, int[][] maze) {
        // Write your code here.
        int[][] dp = new int[m][n];

        for (int[] row:
             dp) {
            Arrays.fill(row,-1);
        }
        return mazeObstaclesHelper(n-1,m-1,maze,dp);
    }

    private static int mazeObstaclesHelper(int i, int j, int[][] maze, int[][] dp) {

        if (i>=0 && j>=0 && maze[i][j]==1){
            return 0;
    }
        if (i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        if (dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        int up = mazeObstaclesHelper(i-1,j,maze,dp);
        int left=mazeObstaclesHelper(i,j-1,maze,dp);

        return dp[i][j]=up+left;

}

    public static void main(String[] args) {
        int[][] maze = {
                {0, 0, 0},
                {0,1,0},
                {0, 0, 0}
        };

        int n=maze.length;
        int m=maze[0].length;

        System.out.println(mazeObstacles(n,m,maze));
        System.out.println(uniquePathsWithObstacles(maze));
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid){
        int n= obstacleGrid.length;
        int m=obstacleGrid[0].length;

        int dp[][]=new int[n][m];
        for (int[] row:
             dp) {
            Arrays.fill(row,-1);
        }
        return helperClass(n,m,obstacleGrid,dp);
    }

    private static int helperClass(int n, int m, int[][] obstacleGrid, int[][] dp) {

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {

                if (i>0 && j>0 && obstacleGrid[i][j]==1)
                {
                    dp[i][j]=0;
                    continue;
                }
                if (i==0 && j==0)
                {
                    dp[i][i]= 1;
                }

                int up=0;
                int left=0;

                if (i>0)
                {
                    up=dp[i-1][j];
                }
                if (j>0)
                {
                    left=dp[i][j-1];
                }
                return dp[i][j]=up+left;
            }
        }
        return dp[n-1][m-1];
    }
}
