public class prime {
    public static void main(String[] args) {
        int n =20;
        for (int i =1; i <=n ; i++) {
            System.out.println(i+ " " + isPrime(i));
        }
//        int n =12;
//        boolean isprime = true;
//
//        for (int i = 2; i <n ; i++) {
//            if (n%i==0){
//                isprime=false;
//                break;
//            }
//        }
//        if (n<2){
//            isprime=false;
//        }
//        if (isprime){
//            System.out.println(" prime");
//        }else {
//            System.out.println("Not a prime");
//        }
        
    }
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c=2;
        while (c*c<=n){
            if (n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
