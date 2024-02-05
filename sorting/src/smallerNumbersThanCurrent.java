import java.util.Arrays;
import java.util.HashMap;

class smallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums={ 8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortednum= Arrays.copyOf(nums,nums.length);
        Arrays.sort(sortednum);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            map.putIfAbsent(sortednum[i],i);
        }

        int[] res = new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            res[i]=map.get(sortednum[i]);
        }
        return res;

    }
}