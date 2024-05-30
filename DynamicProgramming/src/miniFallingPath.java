import java.util.Arrays;

class MinFallingPath {
    public static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int dp[][] = new int[n][m]; // Array to store computed falling path sums

        // Initialize dp array with a large positive value
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        int min = Integer.MAX_VALUE;

        // Iterate through each column in the first row
        for (int j = 0; j < m; j++) {
            int ans = dp(n - 1, j, m, matrix, dp); // Compute falling path sum starting from cell (n-1, j)
            min = Math.min(min, ans); // Update min with the minimum falling path sum found
        }
        return min;
    }

    private static int dp(int i, int j, int m, int[][] matrix, int[][] dp) {
        // Base cases
        if (j < 0 || j >= m)
            return Integer.MAX_VALUE; // Return a large positive value for out of bounds
        if (i == 0)
            return matrix[0][j];

        // If the falling path sum for cell (i, j) is already computed, return it
        if (dp[i][j] != Integer.MAX_VALUE)
            return dp[i][j];

        // Calculate falling path sum recursively for each possible move
        int up = matrix[i][j] + dp(i - 1, j, m, matrix, dp);
        int leftd = matrix[i][j] + dp(i - 1, j - 1, m, matrix, dp);
        int rightd = matrix[i][j] + dp(i - 1, j + 1, m, matrix, dp);

        // Store the minimum falling path sum for cell (i, j) in dp array
        return dp[i][j] = Math.min(up, Math.min(leftd, rightd));
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {2, 1, 3},
                {6, 5, 4},
                {7, 8, 9}
        };
        System.out.println(minFallingPathSum(matrix)); // Output the minimum falling path sum
    }
}
