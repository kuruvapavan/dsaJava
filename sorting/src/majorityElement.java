import java.util.Arrays;

class majorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
       int major= majorityElement(nums);
        System.out.println((major));
    }
//    public static int majorityElement(int[] nums) {
//        int n= nums.length;
//        for (int i = 0; i <nums.length ; i++) {
//            for (int j = 1; j <nums.length-1; j++) {
//                if (nums[j]<nums[j-1]){
//                    int temp=nums[j];
//                    nums[j]=nums[j-1];
//                    nums[j-1]=temp;
//                }
//            }
//
//        }
//        return nums[n/2];

    static int majorityElement(int[] nums){
         int majority=nums[0]; int vote=1;
        for (int i = 1; i <nums.length ; i++) {
            if (vote==0){
                vote++;
                majority=nums[i];
            } else if (majority==nums[i]) {
                vote++;
                
            }
            else {
                vote--;
            }
        }
        return majority;
    }
}