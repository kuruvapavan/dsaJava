import java.util.Arrays;

class sortArrayByParity1 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    public static int[] sortArrayByParity(int[] nums) {
//        int[] sorted = new int[nums.length];
//        int evenIndex = 0;
//
//        // First add all even numbers
//        for (int num : nums) {
//            if (num % 2 == 0) {
//                sorted[evenIndex++] = num;
//            }
//        }
//
//        // Then add all odd numbers
//        for (int num : nums) {
//            if (num % 2 == 1) {
//                sorted[evenIndex++] = num;
//            }
//        }
//
//        return sorted;

        int j=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]%2==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return nums;
    }
}
