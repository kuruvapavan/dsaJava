import java.util.ArrayList;
import java.util.List;

class findAllDuplicates {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> result = findDuplicates(nums);
        System.out.println(result);
    }
    public static  List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correctIndex=nums[i]-1;
            if (nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j <nums.length ; j++) {
            if (nums[j]!=j+1){
                ans.add(nums[j]);
            }

        }
        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}