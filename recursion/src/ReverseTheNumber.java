public class ReverseTheNumber {
    public static void main(String[] args) {
        System.out.println(rev(4321));
    }

//   static int sum=0;
//    static void rev(int n){
//        if (n==0){
//            return;
//        }
//        int rem=n%10;
//        sum=sum*10+rem;
//        rev(n/10);
//    }
static int rev(int n){
    int digits= (int) (Math.log10(n)) + 1;
    return helper(n,digits);

}

    private static int helper(int n, int digits) {
        if (n%10==0){
            return n;
        }
        int rem= n%10;
        return rem * (int) (Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
}
