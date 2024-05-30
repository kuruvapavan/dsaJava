import java.util.Arrays;

class coinChange2 {
//    public static int change(int amount, int[] coins) {
//        int n=coins.length;
//        return changeHelper(amount,coins,n-1);
//    }
//
//    private static int changeHelper(int amount, int[] coins, int ind) {
//        if (ind==0)
//        {
//            if(amount%coins[0]==0)
//            {
//                return 1;
//            }
//            else {
//                return 0;
//            }
//        }
//        int notTaken=changeHelper(amount,coins,ind-1);
//        int taken=0;
//        if (coins[ind]<=amount)
//        {
//            taken=changeHelper(amount-coins[ind],coins,ind);
//        }
//        return notTaken+taken;

    public static int change(int amount, int[] coins)
    {
        int n=coins.length;
        int[][] dp = new int[n][amount+1];
        for (int[] row:
             dp) {
            Arrays.fill(row,-1);
        }
        return changeHelper(amount,coins,n-1,dp);
    }

    private static int changeHelper(int amount, int[] coins, int ind, int[][] dp) {
        if (ind==0)
        {
            if (amount%coins[0]==0)
            {
                return 1;
            }
            else {
                return 0;
            }
        }
        if (dp[ind][amount]!=-1)
        {
            return dp[ind][amount];
        }
        int notTaken=changeHelper(amount,coins,ind-1,dp);
        int taken=0;
        if(coins[ind]<=amount)
        {
            taken=changeHelper(amount-coins[ind],coins,ind,dp);
        }
        return dp[ind][amount]=notTaken+taken;
    }

    public static void main(String[] args) {
        int amount=5;
        int[] coins={1,2,5};
        System.out.println(change(amount,coins));
    }

}