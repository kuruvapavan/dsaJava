public class SumOfNNaturalNums {
    public static void main(String[] args) {
        System.out.println(sumofn(6));
    }
    static int sumofn(int n){
        if (n<=1){
            return n;
        }
        return n+sumofn(n-1);
    }
}
