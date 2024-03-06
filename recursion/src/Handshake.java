public class Handshake {


        // Function to find factorial of a number
        public static long factorial(int n) {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }

        // Function to calculate the nth Catalan number
        public static long catalanNumber(int n) {
            long catalan = factorial(2 * n) / (factorial(n + 1) * factorial(n));
            //System.out.println(catalan);
            return catalan;
        }
        public static long handshakeWays(int N) {
            if (N % 2 != 0) {
                throw new IllegalArgumentException("N must be even.");
            }
            return catalanNumber(N / 2);
        }

        public static void main(String[] args) {
            int N = 6; // Number of people
            System.out.println("The number of ways " + N + " people can make handshakes without crossing is: " + handshakeWays(N));
        }
    }

