//public class reachNum {
//    public static int reachNumber(int target) {
//        // Ensure we're working with a non-negative target
//        if (target < 0) {
//            target = -target;
//        }
//
//        // Initialize variables
//        int numMoves = 0;
//        int currentSum = 0;
//
//        // Keep moving until the current sum is at least the target
//        while (currentSum < target || (currentSum - target) % 2 != 0) {
//            numMoves++;
//            currentSum += numMoves;
//        }
//
//        return numMoves;
//    }
//
//    public static void main(String[] args) {
//        // Example usage:
//        int target = 10;
//        int minMoves = reachNumber(target);
//        System.out.println("Minimum number of moves to reach " + target + " is " + minMoves);
//    }
//}
public class reachNum {
    public int reachNumber(int target) {
        if (target < 0) {
            target = -target;
        }
        int start = 0;
        int end = target;
        int numMoves = 0;
        long finalPosition = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            long sum = (long) mid * (mid + 1) / 2;

            if (sum >= target) {
                finalPosition = sum;
                numMoves = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        int difference = (int) (finalPosition - target);

        if (difference % 2 != 0) {
            if ((numMoves + 1) % 2 != 0) {
                numMoves += 1;
            } else {
                numMoves += 2;
            }
        }
        return numMoves;
    }

    public static void main(String[] args) {
        reachNum solution = new reachNum();

        // Example usage:
        int target = 9;
        int minMoves = solution.reachNumber(target);
        System.out.println("Minimum number of moves to reach " + target + " is " + minMoves);
    }
}
