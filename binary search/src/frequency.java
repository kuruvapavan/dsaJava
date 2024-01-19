import java.util.Arrays;

public class frequency {
    public boolean possible(int[] nums, int mid, int k) {
        long windowSum = 0;
        long totalSum = 0;

        for (int i = 0; i < mid; i++) {
            windowSum += nums[i];
        }
        totalSum = 1L * nums[mid - 1] * mid;

        if (totalSum - windowSum <= k) {
            return true;
        }

        int j = 0;
        for (int i = mid; i < nums.length; i++) {
            windowSum -= nums[j];
            windowSum += nums[i];
            totalSum = 1L * nums[i] * mid;

            if (totalSum - windowSum <= k) {
                return true;
            }
            j++;
        }

        return false;
    }

    public int maxFrequency(int[] nums, int k) {
        int start = 1, end = nums.length, ans = 0;
        Arrays.sort(nums);

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (possible(nums, mid, k)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        frequency solution = new frequency();

        // Example input
        int[] nums = {1, 2, 4};
        int k = 5;

        // Call the maxFrequency method
        int result = solution.maxFrequency(nums, k);

        // Print the result
        System.out.println("The maximum frequency is: " + result);
    }
}
