public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerThree(27));
        System.out.println(isPowerFour(16));
    }
    static boolean isPowerOfTwo(int n) {
            if(n==0){
                return false;
            }
            return ((n==1)) || (n%2==0) && isPowerOfTwo(n/2);

    }
    static boolean isPowerThree(int n){
        if (n==0)
            return false;
        return
                ((n==1)) || (n%3==0) && isPowerThree(n/3);
    }
    static boolean isPowerFour(int n){
        if (n==0)
            return false;
        return
                ((n==1)) || (n%4==0) && isPowerFour(n/4);
    }


}
