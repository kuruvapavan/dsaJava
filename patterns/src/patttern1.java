public class patttern1 {
    public static void main(String[] args) {
    pat1(4);
    }
    static void pat1(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
