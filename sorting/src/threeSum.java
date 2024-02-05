import java.util.*;

class threeSum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums == null || nums.length < 3) return new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i <nums.length-2 ; i++) {
            int left=i+1;
            int right=nums.length-1;

            while (left<right){
                int sum=nums[i]+nums[left]+nums[right];

                if (sum==0){
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                } else if (sum<0) {
                    left++;
                }else {
                    right --;
                }
            }
        }
        return new ArrayList<>(list);
    }
}