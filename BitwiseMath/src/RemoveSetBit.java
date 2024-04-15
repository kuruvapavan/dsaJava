public class RemoveSetBit {
    public static void main(String[] args) {
        System.out.println(setbit(40));
    }
    static int setbit(int n){
        while (n!=0){
            n=n&(n-1);
        }
        return n;
    }
}
