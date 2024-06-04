import java.util.Arrays;

class ShortestCommonSupersequence {
    public static int shortestCommonSupersequence(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        int[][] dp = new int[l1 + 1][l2 + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int lcsLength = lcsHelper(str1, str2, l1, l2, dp);
        return l1 + l2 - lcsLength;
    }

    private static int lcsHelper(String str1, String str2, int l1, int l2, int[][] dp) {
        if (l1 == 0 || l2 == 0) {
            return 0;
        }
        if (dp[l1][l2] != -1) {
            return dp[l1][l2];
        }
        if (str1.charAt(l1 - 1) == str2.charAt(l2 - 1)) {
            dp[l1][l2] = 1 + lcsHelper(str1, str2, l1 - 1, l2 - 1, dp);
        } else {
            dp[l1][l2] = Math.max(lcsHelper(str1, str2, l1 - 1, l2, dp), lcsHelper(str1, str2, l1, l2 - 1, dp));
        }
        return dp[l1][l2];
    }

    public static void main(String[] args) {
        String s1 = "brute";
        String s2 = "groot";

        System.out.println("The length of the shortest common super sequence is " + shortestCommonSupersequence(s1, s2));
    }
}
