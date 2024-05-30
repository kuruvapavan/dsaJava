import java.util.Arrays;

public class subsetSumToK {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int k = 4;
        int n = arr.length;
        if (subsetSumtoK(n, k, arr))
            System.out.println("Subset with the given target found");
        else
            System.out.println("Subset with the given target not found");
    }
    static boolean subsetSumtoK(int n, int k, int[] arr){
        int[][] dp= new int[n][k+1];
        for (int row[] : dp)
            Arrays.fill(row, -1);

        return subetSum(n-1,k,arr,dp);
    }

    private static boolean subetSum(int index, int target, int[] arr, int[][] dp) {
        if (target==0)
        {
            return true;
        }
        if (index==0)
        {
            return arr[0]==target;
        }
        if (dp[index][target]!=-1)
        {
            return dp[index][target]==0 ? false : true;
        }

        boolean notTaken=subetSum(index-1,target,arr,dp);

        boolean taken=false;
        if (arr[index]<target)
        {
            taken=subetSum(index-1,target-arr[index],arr,dp);
        }
        dp[index][target] = notTaken || taken ? 1 : 0;
        return notTaken || taken;
    }

}
