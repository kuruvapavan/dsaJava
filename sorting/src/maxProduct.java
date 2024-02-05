import java.util.Arrays;

class maxProduct {
    public static void main(String[] args) {
        int[] nums={3,4,5,2};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int[] sortedArray= Arrays.copyOf(nums,nums.length);
        Arrays.sort(sortedArray);
        int prod=1;
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i+1; j <sortedArray.length ; j++) {
                prod = Math.max(prod    , (nums[i] - 1) * (nums[j] - 1));
            }
        }
        return prod;
    }
}