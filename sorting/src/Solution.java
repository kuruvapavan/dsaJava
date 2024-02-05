import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public static void main(String[] args) {
        int[] nums ={3,2,1,5,6,4};
        int k =2;
        int[] ans = new int[]{findKthLargest(nums, k)};
        System.out.println(Arrays.toString(ans));
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minpq = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            if (minpq.size() < k) {
                minpq.add(nums[i]);
            } else {
                if (minpq.peek() < nums[i]) {
                    minpq.poll(); // Removes the smallest element
                    minpq.add(nums[i]);
                }
            }
        }

        // Returns the kth largest element
        return minpq.peek();
        
    }
}