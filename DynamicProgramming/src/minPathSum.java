import java.util.Arrays;

class minPathSum {
//    public static int minPathSum(int[][] grid) {
//        int n = grid.length-1;
//        int m = grid[0].length-1;
//        //return path(m,n,grid);
//
//    }

//    private static int path(int n, int m, int[][] grid) {
//
//        if (n<0 || m<0)
//        {
//            return Integer.MAX_VALUE;
//        }
//        if (m==0 && n==0)
//        {
//            return grid[m][n];
//        }
//
//        int up= path(n-1,m,grid);
//        int left=path(n,m-1,grid);
//
//        return grid[n][m]+Math.min(up,left);
//    }
public static int minPathSum(int[][] grid) {
    int n = grid.length;
    int m = grid[0].length;

    int[][] dp = new int[n][m];

    // Initialize dp array with -1
    for (int[] row : dp) {
        Arrays.fill(row,-1);
    }

    return helperminPath(n - 1, m - 1, grid, dp);
}

    private static int helperminPath(int i, int j, int[][] grid, int[][] dp) {
        if (i == 0 && j == 0) {
            return grid[0][0];
        }
        if (i < 0 || j < 0) {
            return Integer.MAX_VALUE;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int up = grid[i][j] + helperminPath(i - 1, j, grid, dp);
        int left = grid[i][j] + helperminPath(i, j - 1, grid, dp);

        return  dp[i][j] = Math.min(up, left);


    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        System.out.println("Minimum path sum: " + minPathSum(grid));
    }

}
