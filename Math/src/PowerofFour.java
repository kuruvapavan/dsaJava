public class PowerofFour {
    public static void main(String[] args) {
        int n=64;
        System.out.println(ispoweroffour(64));
    }
    static boolean ispoweroffour(int n){
        if (n==0){
            return false;
        }else {
            return ((n==1) || (n%4==0) && ispoweroffour(n/4));
        }
    }

}
