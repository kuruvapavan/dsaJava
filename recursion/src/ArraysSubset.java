import javax.swing.plaf.ListUI;
import java.util.ArrayList;
import java.util.List;

public class ArraysSubset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        for (List<Integer> list:
            ans ) {
            System.out.println(list);
        }
        List<List<Integer>> ans2= new ArrayList<>();
        generateSubset(arr,0,new ArrayList<>(),ans2);
        for (List<Integer> list:
           ans2 ) {
            System.out.println(list);
        }

    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr){
             int n = outer.size();
            for (int i = 0; i <n ; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;

    }

    static void generateSubset(int[] arr, int index, List<Integer> current, List<List<Integer>> ans){
        if (index==arr.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(arr[index]);
        generateSubset(arr,index+1,current,ans);
        current.remove(current.size()-1);
        generateSubset(arr,index+1,current,ans);
    }
}
