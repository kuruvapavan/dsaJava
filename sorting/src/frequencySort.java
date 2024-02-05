import java.util.*;

class frequencySort {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,2,3};
        int[] ans=frequencySort(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] frequencySort(int[] nums) {
        int[] sortedArray = Arrays.copyOf(nums,nums.length);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num:
             nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->{
            return (map.get(a)==map.get(b)?b-a:map.get(a)-map.get(b));
        });
        int[] res= new int[nums.length];
        int i=0;
        for (int num:
             list) {
            for (int j = 0; j < map.get(num); j++) {
                res[i++] = num;
            }
            
        }
        return res;
    }
}