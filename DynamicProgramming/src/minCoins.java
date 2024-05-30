//import java.util.Arrays;
//import java.util.Map;
//
////class MinCoins {
////    public static int coinChange(int[] coins, int amount) {
////        int result = minCoins(coins, amount, coins.length - 1);
////        return result == Integer.MAX_VALUE ? -1 : result;
////    }
////
////    private static int minCoins(int[] coins, int amount, int ind) {
////        // Base case: if amount is zero, no coins are needed
////        if (amount == 0) {
////            return 0;
////        }
////
////        // Base case: if no coins left or amount is negative, return a large value
////        if (ind < 0 || amount < 0) {
////            return Integer.MAX_VALUE;
////        }
////
////        // Recursive call for not taking the current coin
////        int notTaken = minCoins(coins, amount, ind - 1);
////
////        // Recursive call for taking the current coin
////        int taken = Integer.MAX_VALUE;
////        if (coins[ind] <= amount) {
////            int res = minCoins(coins, amount - coins[ind], ind);
////            if (res != Integer.MAX_VALUE) {
////                taken = 1 + res;
////            }
////        }
////
////        // Return the minimum of taking or not taking the coin
////        return Math.min(taken, notTaken);
////    }
////
////    public static void main(String[] args) {
////        int[] coins = {2, 5, 10, 1};
////        int amount = 27;
////        System.out.println(coinChange(coins, amount)); // Expected output: 4 (10 + 10 + 5 + 2)
////    }
////}
//class minCoins
//{
//    public static int coinChange(int[] coins, int amount) {
//        int n = coins.length;
//        int[][] dp = new int[n][amount + 1];
//
//        // Initialize dp array with -1 to indicate uncomputed states
//        for (int[] row : dp) {
//            Arrays.fill(row, -1);
//        }
//
//        int ans = minCoins(coins, amount, n - 1, dp);
//
//        // If ans is still a very large value, return -1 indicating no solution
//        return ans >= (int) Math.pow(10, 9) ? -1 : ans;
//    }
//
//
//    private static int minCoins(int[] coins, int amount, int ind, int[][] dp) {
//        // Base case: if we have only one type of coin
//        if (ind == 0) {
//            return (amount % coins[ind] == 0) ? amount / coins[ind] : (int) Math.pow(10, 9);
//        }
//
//        // If the solution has been already computed, return it
//        if (dp[ind][amount] != -1) {
//            return dp[ind][amount];
//        }
//
//        // Recursive case: not taking the current coin
//        int notTaken = minCoins(coins, amount, ind - 1, dp);
//
//        // Recursive case: taking the current coin
//        int taken = (int) Math.pow(10, 9);
//        if (coins[ind] <= amount) {
//            taken = 1 + minCoins(coins, amount - coins[ind], ind, dp);
//        }
//
//        // Store the computed result in dp array
//        return dp[ind][amount] = Math.min(taken, notTaken);
//    }
//
//    public static void main(String[] args) {
//        int[] coins = {1, 2, 3};
//        int amount = 7;
//        System.out.println(coinChange(coins, amount)); // Expected output: 3 (2+2+3 or 1+1+1+1+1+1+1)
//    }
//}
class minCoins{
    public int coinChange(int[] coins, int amount)
    {
        int n=coins.length;

        int[][] dp = new  int[n][amount+1];
        for (int i = 0; i <=amount ; i++) {
            if(i%coins[0]==0)
            {
                dp[0][i]=i/coins[0];
            }
            else
                dp[0][i]=(int) Math.pow(10,9);

        }
        for (int i = 1; i <n ; i++) {
            for (int target = 0; target <=amount ; target++) {
                int notTaken=0+dp[i-1][target];
                int taken=(int) Math.pow(10,9);


                if (coins[i]<=amount)
                    taken=1+dp[i-1][target];

                dp[i][target]=Math.min(taken,notTaken);
            }
        }

        int ans=dp[n-1][amount];

        if (ans>=(int) Math.pow(10,9)){
            return -1;
        }
        return ans;
    }

    public static void main(String[] args) {

    }

}