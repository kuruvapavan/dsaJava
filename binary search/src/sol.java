import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class sol {
    public static void main(String[] args) {
        int[] A ={1,2};
        int[] B ={2,3};
        System.out.println(Arrays.toString(fairCandySwap(A,B)));

    }
    public static int[] fairCandySwap(int[] A, int[] B){
        int sumA=0;
        int sumB=0;

        HashSet<Integer> setB = new HashSet<>();

        for (int i:A) {
            sumA+=i;
        }
        for (int j: B) {
            sumB+=j;
            setB.add(j);
        }
        int diff = (sumB-sumA)/2;

        for (int k:A) {
            if (setB.contains(k+diff)){
                return new int[]{k,k+diff};
            }
        }
        return new int[0];
    }
}
