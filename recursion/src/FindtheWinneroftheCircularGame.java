public class FindtheWinneroftheCircularGame {
    public static void main(String[] args) {
        System.out.println(findwinner(5,2));
    }
    static int findwinner(int n, int k){
        return helper(n,k)+1;
    }
    public  static int helper(int n, int k){
        if (n==10){
            return 0;
        }
        else {
            return (helper(n-1,k)+k)%n;
        }
    }
}
