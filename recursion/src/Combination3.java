import java.util.ArrayList;
import java.util.List;

public class Combination3 {
    public static void main(String[] args) {
        System.out.println(combinationSum3(3,7));
    }
    static  List<List<Integer>> combinationSum3(int k, int n){
        List<List<Integer>> ans = new ArrayList<>();
        combination(ans,new ArrayList<Integer>(),k,n,1);
        return ans;
    }

    public static void combination(List<List<Integer>> ans, ArrayList<Integer> comb, int k, int n, int start) {
        if (comb.size()==k && n==0){
            ans.add(new ArrayList<>(comb));
            return;
        }
        for (int i = start; i <=9 ; i++) {
            if (n-i<0){
                break;
            }
            comb.add(i);
            combination(ans,comb,k,n-i,i+1);
            comb.remove(comb.size()-1);
        }
    }
}
