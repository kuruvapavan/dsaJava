public class palindrome {
    public static void main(String[] args) {
        System.out.println(pal(4321234));
    }
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
    static boolean pal(int n){
        return n==rev(n);
    }

}
