import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CountGreaterThanItself {
    public static List<Integer> countSmaller(int[] nums) {
        int len = nums.length;
        List<Integer> ans = new ArrayList<Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i : nums) {
            arr.add(i);
        }
        Collections.sort(arr);

        for (int i = 0; i < len; i++) {
            int index = binarySearch(arr, nums[i]);
            ans.add(index);
            arr.remove(index);
        }
        return ans;
    }

    public static int binarySearch(ArrayList<Integer> arr, int target) {
        int start = 0;
        int end = arr.size() - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            int val = arr.get(mid);
            if (val < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if (arr.get(start) == target) {
                return start;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        List<Integer> result = CountGreaterThanItself.countSmaller(new int[]{5, 2, 6, 1});

        System.out.println("Output: " + result);
    }
}
