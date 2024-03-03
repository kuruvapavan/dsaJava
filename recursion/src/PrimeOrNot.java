public class PrimeOrNot {
    public static void main(String[] args) {
//        int num = 29;
//        boolean flag = false;
//        for (int i = 2; i < num / 2; i++) {
//            if (num % 1 == 0) {
//                flag = true;
//                break;
//            }
//        }
//        if (!flag) {
//            System.out.println("Not prime");
//        } else
//            System.out.println("Prime");
        System.out.println(primeorNo(15,2));
    }
        ;

    static boolean primeorNo(int n, int i) {
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return primeorNo(n, i + 1);
    }
}
