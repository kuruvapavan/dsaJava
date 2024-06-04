import java.util.Arrays;

class DeleteOperationforTwoStrings {
    public static int minDistance(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int[][] dp = new int[l1 + 1][l2 + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int lcsLength = lcsHelper(word1, word2, l1, l2, dp);
        return l1 + l2 - 2 * lcsLength;
    }

    private static int lcsHelper(String text1, String text2, int l1, int l2, int[][] dp) {
        if (l1 == 0 || l2 == 0) {
            return 0;
        }
        if (dp[l1][l2] != -1) {
            return dp[l1][l2];
        }
        if (text1.charAt(l1 - 1) == text2.charAt(l2 - 1)) {
            dp[l1][l2] = 1 + lcsHelper(text1, text2, l1 - 1, l2 - 1, dp);
        } else {
            dp[l1][l2] = Math.max(lcsHelper(text1, text2, l1 - 1, l2, dp), lcsHelper(text1, text2, l1, l2 - 1, dp));
        }
        return dp[l1][l2];
    }

    public static void main(String[] args) {
        String word1 = "sea";
        String word2 = "eat";
        System.out.println("Minimum delete operations: " + minDistance(word1, word2));  // Output should be 2
    }
}
