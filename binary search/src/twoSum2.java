import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

public class twoSum2 {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }
    static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map = new IdentityHashMap<>();
        int[] arr = new int[2];
        int n = nums.length;

        for (int i = 0; i <n ; i++) {
            map.put(nums[i],i);
            System.out.println(map);

        }

        int secondindex=0;

        for (int i = 0; i <n ; i++) {
            if (map.containsKey(target-nums[i])){
                secondindex=map.get(target-nums[i]);
                arr[0]=i+1;
                arr[1]=secondindex+1;
                break;
            }
        }
        return arr;
    }
}
