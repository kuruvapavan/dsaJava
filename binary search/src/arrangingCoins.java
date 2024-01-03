public class arrangingCoins {
    public static void main(String[] args) {
        arrangingCoin arrangingCoins = new arrangingCoin();

        // Test cases
        int n1 = 5;
        int n2 = 8;
        int n3 = 10;

        System.out.println("Arranged coins for " + n1 + ": " + arrangingCoins.arrange(n1));
        System.out.println("Arranged coins for " + n2 + ": " + arrangingCoins.arrange(n2));
        System.out.println("Arranged coins for " + n3 + ": " + arrangingCoins.arrange(n3));
    }
}

class arrangingCoin {
    public int arrange (int n) {
        long start = 0;
        long end = n;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long coins = mid * (mid + 1) / 2;

            if (coins == n) {
                return (int) mid;
            } else if (n < coins) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return (int) end;
    }
}
