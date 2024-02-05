import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class minimumAbsDifference {
    public static void main(String[] args) {
        int[] arr={3,8,-10,23,19,-4,-14,27};
        List<List<Integer>> ans = minimumAbsDifference(arr);
        System.out.println(ans);
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        int minDiff=Integer.MAX_VALUE;
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i <arr.length-1 ; i++) {
            minDiff=Math.min(minDiff,arr[i+1]-arr[i]);
        }
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i+1]-arr[i]==minDiff){
                ans.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return ans;
    }
}