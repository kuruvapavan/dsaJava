import java.util.Arrays;

public class MinimumCosttoCutaStick {
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        int[] newCuts = new int[cuts.length + 2];
        newCuts[0] = 0;
        newCuts[newCuts.length - 1] = n;
        System.arraycopy(cuts, 0, newCuts, 1, cuts.length);

        int m = newCuts.length;
        int[][] dp = new int[m][m];

        for (int length = 2; length < m; length++) {
            for (int left = 0; left < m - length; left++) {
                int right = left + length;
                dp[left][right] = Integer.MAX_VALUE;
                for (int i = left + 1; i < right; i++) {
                    int cost = newCuts[right] - newCuts[left] + dp[left][i] + dp[i][right];
                    dp[left][right] = Math.min(dp[left][right], cost);
                }
            }
        }
        return dp[0][m - 1];
    }


    private static int mincostHelper(int[] cuts, int left, int right) {
        // If there is no cut between left and right
        if (right - left <= 1) {
            return 0;
        }

        // Initialize the minimum cost as a large number
        int minCost = Integer.MAX_VALUE;

        // Try making each cut between left and right
        for (int i = left + 1; i < right; i++) {
            int cost = cuts[right] - cuts[left] + mincostHelper(cuts, left, i) + mincostHelper(cuts, i, right);
            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }

    // Example usage
    public static void main(String[] args) {
        MinimumCosttoCutaStick solution = new MinimumCosttoCutaStick();
        int n = 7;
        int[] cuts = {1, 3, 4, 5};
        System.out.println(solution.minCost(n, cuts));  // Output should be 16
    }
}
