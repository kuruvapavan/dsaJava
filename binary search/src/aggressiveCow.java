import java.util.Arrays;

public class aggressiveCow {
    public static void main(String[] args) {
        // Example usage
        int[] stalls = {1, 2, 4, 8, 9};
        int k = 3;

        int result = aggressiveCows(stalls, k);
        System.out.println("The maximum minimum distance for " + k + " cows is: " + result);
    }

    private static boolean check(int x, int k, int[] stalls) {
        int cowsPlaced = 1, lastPos = stalls[0];
        int n = stalls.length;

        for (int i = 1; i < n; i++) {
            if ((stalls[i] - lastPos) >= x) {
                cowsPlaced++;

                if (cowsPlaced == k) {
                    return true;
                }

                lastPos = stalls[i];
            }
        }

        return false;
    }

    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int low = 0, high = 1000000000, mid, pos = 0;

        while (high >= low) {
            mid = (high + low) / 2;

            if (check(mid, k, stalls)) {
                low = mid + 1;
                pos = mid;
            } else {
                high = mid - 1;
            }
        }

        return pos;
    }
}
