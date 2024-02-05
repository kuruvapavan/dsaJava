import java.util.Arrays;
import java.util.HashMap;

class arrayRankTransform {
    public static void main(String[] args) {
        int[] arr = {40,10,20,30};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    public static int[] arrayRankTransform(int[] arr) {
        if (arr==null || arr.length==0){
            return new int[0];
        }
        int[] temp = arr.clone();
        Arrays.sort(temp);

        HashMap<Integer,Integer> map = new HashMap<>();
        int rank=1;
        for (int value:temp) {
            if (!map.containsKey(value)){
                map.put(value,rank++);
            }
        }
        System.out.println(map);
        int[] ranks = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ranks[i] = map.get(arr[i]);
            System.out.println(rank);
        }
        return ranks;
    }

}