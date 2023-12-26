import java.util.ArrayList;

public class returningArrayList {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,4,5};
        System.out.println(find(arr,4,0,new ArrayList<>()));
    }
    static ArrayList<Integer> find(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index==arr.length) {
            return list;
        }
        if (arr[index]==target) {
            list.add(index);
        }
        return find(arr,target,index+1,list);
    }
}
