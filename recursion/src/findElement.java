import java.util.ArrayList;

public class findElement {
    public static void main(String[] args) {
    int[] arr = {1,3,4,6,8,8,10};
    int target=8;
        System.out.println(find(arr,target,0));
        //findAllIndex(arr,target,0);
        //System.out.println(list);
        findIndices(arr,target,0,list);
        System.out.println(list);
    }
    static boolean find(int[] arr , int target, int index){
        if (index==arr.length-1)
            return false;
        return (arr[index]==target || find(arr,target,index+1));
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if (index==arr.length-1){
            return;
        }
        if (arr[index]==target)
            list.add(index);
        findAllIndex(arr,target,index+1);
    }
    //using arrayList as parameter;

    static ArrayList findIndices(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index==arr.length-1){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
        return findIndices(arr,target,index+1,list);
    }
}
