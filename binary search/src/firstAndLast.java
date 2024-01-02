public class firstAndLast {
    public static void main(String[] args) {
        firstAndLast solution = new firstAndLast();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = solution.searchRange(nums, target);

        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }

    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    public int findFirst(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int first = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                first = mid;
                end = mid - 1;
            }
        }

        return first;
    }

    public int findLast(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int last = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                last = mid;
                start = mid + 1;
            }
        }

        return last;
    }
}
