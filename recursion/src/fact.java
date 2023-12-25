public class fact {
    public static void main(String[] args) {
      int f= fac(4);
        System.out.println(f);
    }
    static int fac(int n){
        if (n==0)
            return 1 ;

        else {
            return n*fac(n-1);
        }
    }
}
