import java.util.Arrays;

class sortedSquares {
    public static void main(String[] args) {


        int[] nums= {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    public static int[] sortedSquares(int[] nums) {
//        int n = nums.length;
//        int[] res = new int[n];
//        int left =0; int right=n-1;
//        int resIndex=n-1;
//        while (left<=right){
//            if (nums[left]>nums[right]){
//                res[resIndex--]=nums[left]*nums[left];
//                left++;
//            }else {
//                res[resIndex--]=nums[right]*nums[right];
//                right--;
//            }
//        }
//        Arrays.sort(res);
//        return res;
        int n = nums.length;
        int[] res = new int[nums.length];
        int left = 0;
        int right = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                square = nums[right];
                right--;
            } else {
                square = nums[left];
                left++;
            }
            res[i] = square * square;
        }
        return res;
    }
}