import java.util.ArrayList;

public class NDigitsNumberWithDigitsInIncreaseOrder {
    public static void main(String[] args) {
        System.out.println(increaseNumbers(3));

    }
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> increaseNumbers(int n){
     if (n==1){
         for (int i = 0; i <=9 ; i++) {
             list.add(i);
             return list;
         }
     }
     else {
         recursive(1,n,0);
     }
     return list;
    }

    private static void recursive(int last, int n, int num) {
        if (n==0){
            list.add(num);
            return;
        }
        for (int i = last; i <=9 ; i++) {
            int a = num*10+i;
            recursive(i+1,n-1,a);
        }
    }
}
