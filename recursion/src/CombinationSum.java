import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
public  static  List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            findCombinations(0,candidates, target,ans, new ArrayList<Integer>());
            return ans;

    }

    private static void findCombinations(int index, int[] candidates, int target, List<List<Integer>> ans, ArrayList<Integer> list) {
    if (target==0) {
        ans.add(new ArrayList<>(list));
        return;
    }
    if (index==candidates.length){
        return;
    }
        if (candidates[index]<=target){
            list.add(candidates[index]);
            findCombinations(index+1,candidates,target-candidates[index],ans,list);
            list.remove(list.size()-1);
        }
        findCombinations(index+1,candidates,target,ans,list);
    }


    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> res = combinationSum(candidates,target);
        System.out.println(res);
    }
}
