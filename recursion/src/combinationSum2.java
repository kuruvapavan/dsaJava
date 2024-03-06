import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); // Sort the candidates array to help avoid duplicates
        List<List<Integer>> ans = new ArrayList<>();
        findCombinationS(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private static void findCombinationS(int index, int[] candidates, int target, List<List<Integer>> ans, ArrayList<Integer> list) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            // Skip duplicates
            if (i > index && candidates[i] == candidates[i-1]) {
                continue;
            }
            if (candidates[i] > target) {
                break;
            }
            list.add(candidates[i]);
            findCombinationS(i + 1, candidates, target - candidates[i], ans, list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> res = combinationSum2(candidates, target);
        System.out.println(res);
    }
}
