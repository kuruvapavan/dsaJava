public class climbStairs {
    public static void main(String[] args) {
        int n=10;
        System.out.println(climbstairs(n));
    }
    static  int climbstairs(int n)
    {
        if (n==0 || n==1)
        {
            return 1;
        }
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;

        for (int i = 2; i <=n ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
