public class sumofdigits {
    public static void main(String[] args) {
        System.out.println(sumofN(1342));
    }
    static int sumofN(int n){
        if (n==0){
            return 0;
        }
        else {
            return n%10+sumofN(n/10);
        }
    }
}
