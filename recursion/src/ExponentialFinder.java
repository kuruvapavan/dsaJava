public class ExponentialFinder {
    public static void main(String[] args) {
        int n = 8;
        int a = 2;
        int x = findX(n, a);
        System.out.println("For n = " + n + " and a = " + a + ", x is " + x);
    }

    public static int findX(int n, int a) {
        // Base case: if n is 1, then x is 0 since a^0 = 1
        if (n == 1) {
            return 0;
        } else if (n % a != 0) { // If n is not divisible by a, return -1
            return -1;
        } else {
            // Recursive step: divide n by a and add 1 to the result of the recursion
            return 1 + findX(n / a, a);
        }
    }
}
