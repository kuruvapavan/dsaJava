import java.util.ArrayList;
import java.util.List;

class SelfDividingNumbers {
    public static void main(String[] args) {
        int left=1;
        int right=22;
        System.out.println(selfDividingNumbers(left,right));
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = left; i <=right; i++) {
            if (checking(i)){
                list.add(i);
            }
        }
        return list;
    }

    private static boolean checking(int num)
    {
        int n =num;
        while (n>0){
            int r=n%10;
            if (r==0 || (n%r)!=0){
                return false;
            }
            n=n/10;
        }
        return true;
    }

}