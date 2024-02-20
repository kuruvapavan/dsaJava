public class pattern3 {
    public static void main(String[] args) {
        pat3(4);
    }
    static  void pat3(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = n; j >=i ; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
