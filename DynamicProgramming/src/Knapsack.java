public class Knapsack {
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        return knapsackhelper(weight, value, n - 1, maxWeight);
    }

    private static int knapsackhelper(int[] weight, int[] value, int index, int maxWeight) {
        if (index < 0) {
            return 0; // Base case: return 0 when index is less than 0
        }

        if (index == 0) {
            if (weight[0] <= maxWeight) {
                return value[0];
            } else {
                return 0;
            }
        }

        int notTaken = 0+ knapsackhelper(weight, value, index - 1, maxWeight);
        int taken = Integer.MIN_VALUE;
        if (weight[index] <= maxWeight) {
            taken = value[index] + knapsack(weight, value, index - 1, maxWeight - weight[index]);
        }

        return Math.max(taken, notTaken);
    }

    public static void main(String[] args) {
        int[] weight = {1, 2, 4, 5};
        int[] value = {5, 4, 8, 6};
        int maxWeight = 5;
        int n = weight.length;

        System.out.println(knapsack(weight, value, n, maxWeight));
    }
}

//import java.util.*;
//
//class knapsack {
//    // Helper function to solve the knapsack problem recursively
//    static int knapsackUtil(int[] wt, int[] val, int ind, int W, int[][] dp) {
//        // Base case: If there are no items or the knapsack capacity is zero
//        if (ind == 0) {
//            if (wt[0] <= W) {
//                // Include the item if its weight is within the capacity
//                return val[0];
//            } else {
//                // Otherwise, exclude the item
//                return 0;
//            }
//        }
//
//        // If the result for this subproblem is already calculated, return it
//        if (dp[ind][W] != -1) {
//            return dp[ind][W];
//        }
//
//        // Calculate the maximum value when the current item is not taken
//        int notTaken = 0 + knapsackUtil(wt, val, ind - 1, W, dp);
//
//        // Calculate the maximum value when the current item is taken
//        int taken = Integer.MIN_VALUE;
//        if (wt[ind] <= W) {
//            taken = val[ind] + knapsackUtil(wt, val, ind - 1, W - wt[ind], dp);
//        }
//
//        // Store and return the result for the current state
//        dp[ind][W] = Math.max(notTaken, taken);
//        return dp[ind][W];
//    }
//
//    // Function to solve the 0/1 Knapsack problem using dynamic programming
//    static int knapsack(int[] wt, int[] val, int n, int W) {
//        // Create a 2D DP array to store the maximum value for each subproblem
//        int dp[][] = new int[n][W + 1];
//
//        // Initialize the DP array with -1 to indicate that subproblems are not solved
//        for (int row[] : dp) {
//            Arrays.fill(row, -1);
//        }
//
//        // Call the recursive knapsackUtil function to solve the problem
//        return knapsackUtil(wt, val, n - 1, W, dp);
//    }
//
//    public static void main(String args[]) {
//        int wt[] = {1, 2, 4, 5};
//        int val[] = {5, 4, 8, 6};
//        int W = 5;
//        int n = wt.length;
//
//        // Calculate and print the maximum value of items the thief can steal
//        System.out.println("The Maximum value of items the thief can steal is " + knapsack(wt, val, n, W));
//    }
//}
//
