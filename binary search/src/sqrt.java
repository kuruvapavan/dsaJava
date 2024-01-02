public class sqrt {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int x1 = 8;
        int x2 = 16;
        int x3 = 4;

        System.out.println("Square root of " + x1 + ": " + solution.mySqrt(x1));
        System.out.println("Square root of " + x2 + ": " + solution.mySqrt(x2));
        System.out.println("Square root of " + x3 + ": " + solution.mySqrt(x3));
    }
}

class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int first = 1, last = x;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid > x / mid) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return last;
    }
}
