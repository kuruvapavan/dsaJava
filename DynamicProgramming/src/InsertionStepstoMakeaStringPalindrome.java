import java.util.Arrays;

//import java.util.Arrays;
//
//class MinimumInsertionStepsToMakeAStringPalindrome {
//    public static int minInsertions(String s) {
//        int n = s.length();
//        int lpsLength = longestPalindromeSub(s);
//        return n - lpsLength;
//    }
//
//    private static int longestPalindromeSub(String s) {
//        String rev = new StringBuilder(s).reverse().toString();
//
//        int l1 = s.length();
//        int l2 = rev.length();
//        int[][] dp = new int[l1 + 1][l2 + 1];
//        for (int[] row : dp) {
//            Arrays.fill(row, -1);
//        }
//        return longestPalindromeSubHelper(s, rev, l1, l2, dp);
//    }
//
//    private static int longestPalindromeSubHelper(String s, String rev, int l1, int l2, int[][] dp) {
//        if (l1 == 0 || l2 == 0) {
//            return 0;
//        }
//        if (dp[l1][l2] != -1) {
//            return dp[l1][l2];
//        }
//        if (s.charAt(l1 - 1) == rev.charAt(l2 - 1)) {
//            dp[l1][l2] = 1 + longestPalindromeSubHelper(s, rev, l1 - 1, l2 - 1, dp);
//        } else {
//            dp[l1][l2] = Math.max(longestPalindromeSubHelper(s, rev, l1 - 1, l2, dp), longestPalindromeSubHelper(s, rev, l1, l2 - 1, dp));
//        }
//
//        return dp[l1][l2];
//    }
//
//    public static void main(String[] args) {
//        String s = "zzazz";
//        System.out.println(minInsertions(s));  // Output: 0
//
//        String s2 = "mbadm";
//        System.out.println(minInsertions(s2));  // Output: 2
//
//        String s3 = "abc";
//        System.out.println(minInsertions(s3));  // Output: 2
//    }
//}
class InsertionStepstoMakeaStringPalindrome
{
    static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        // Create a 2D array to store the LCS lengths
        int dp[][] = new int[n + 1][m + 1];

        // Initialize the dp array with -1
        for (int rows[] : dp)
            Arrays.fill(rows, -1);

        // Initialize the first row and first column with 0
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= m; i++) {
            dp[0][i] = 0;
        }

        // Fill the dp array using a bottom-up approach
        for (int ind1 = 1; ind1 <= n; ind1++) {
            for (int ind2 = 1; ind2 <= m; ind2++) {
                if (s1.charAt(ind1 - 1) == s2.charAt(ind2 - 1))
                    dp[ind1][ind2] = 1 + dp[ind1 - 1][ind2 - 1];
                else
                    dp[ind1][ind2] = Math.max(dp[ind1 - 1][ind2], dp[ind1][ind2 - 1]);
            }
        }

        return dp[n][m];
    }

    // Function to find the length of the Longest Palindromic Subsequence
    static int longestPalindromeSubsequence(String s) {
        // Create a reversed version of the input string
        String reversed = new StringBuilder(s).reverse().toString();

        // Calculate the LCS of the original string and its reverse
        return lcs(s, reversed);
    }

    // Function to find the minimum insertions required to make the string palindrome
    static int minInsertion(String s) {
        int n = s.length();
        int k = longestPalindromeSubsequence(s);

        // The minimum insertions required is the difference between the string length and its
        // Longest Palindromic Subsequence length
        return n - k;
    }

    public static void main(String args[]) {
        String s = "abcaa";
        System.out.println("The Minimum insertions required to make the string palindrome: " + minInsertion(s));
    }
}