public class colorSort {
    public static void main(String[] args) {
        // Example usage
        int[] nums = {2, 0, 1, 2, 1, 0};
        sortColors(nums);

        // Print the sorted array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void sortColors(int[] nums) {
        int left = 0;

        // First loop moves all 0s to the beginning
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                swap(nums, left, right);
                left++;
            }
        }

        // Second loop moves all 1s after the 0s
        for (int right = left; right < nums.length; right++) {
            if (nums[right] == 1) {
                swap(nums, left, right);
                left++;
            }
        }
    }

    // Helper method to swap elements in the array
    private static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
