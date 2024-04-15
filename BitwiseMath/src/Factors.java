public class Factors {
    public static void main(String[] args) {
        facts(20);
        fact2(30);
    }
    static void facts(int n){
        for (int i = 1; i <=n ; i++) {
            if (n%i==0){
                System.out.println(i + " ");
            }
        }
    }
    static void fact2(int n){
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i + " ");
                } else {
                    System.out.println(i + " " + n / i + " ");
                }

            }
        }
    }
}
