public class Robber2
{
    public  static int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        // If there are only two houses, return the maximum amount from them.
        if (n == 2) return Math.max(nums[0], nums[1]);

        // Calculate the maximum amount of money robbed if not considering the last house.
        int max1 = robHelper(nums, 0, n - 2);

        // Calculate the maximum amount of money robbed if not considering the first house.
        int max2 = robHelper(nums, 1, n - 1);

        // Return the maximum amount between the two cases.
        return Math.max(max1, max2);
    }

    // Helper function to calculate the maximum amount of money robbed between start and end houses.
    private static int robHelper(int[] nums, int start, int end) {
        int prev = nums[start];
        int prev2 = 0;

        for (int i = start + 1; i <= end; i++) {
            int pick = nums[i] + prev2;
            int notPick = prev;
            int current = Math.max(pick, notPick);
            prev2 = prev;
            prev = current;
        }
        return prev;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(rob(nums));
    }
}
