import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset2 {
    public static void main(String[] args) {
        int[] nums ={1,2,2};
        System.out.println(subsetsWithDup(nums));

    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> resultlist = new ArrayList<>();
        Arrays.sort(nums);
        
        backtracking(resultlist,new ArrayList<>(),nums,0);
        return resultlist;
    }

    private static void backtracking(List<List<Integer>> resultset, List<Integer> tempSet, int[] nums, int start) {
        if (resultset.contains(tempSet))
            return;

        resultset.add(new ArrayList<>(tempSet));

        for (int i = start; i <nums.length ; i++) {
            tempSet.add(nums[i]);

            backtracking(resultset,tempSet,nums,i+1);

            tempSet.remove(tempSet.size()-1);
        }
    }
}
