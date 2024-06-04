public class PrintShortestCommonSupersequence {
    public static String shortestCommonSupersequence(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();

        int[][] dp = new int[l1 + 1][l2 + 1];

        for (int i = 0; i <= l1; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= l2; i++) {
            dp[0][i] = 0;
        }

        for (int ind1 = 1; ind1 <= l1; ind1++) {
            for (int ind2 = 1; ind2 <= l2; ind2++) {
                if (str1.charAt(ind1 - 1) == str2.charAt(ind2 - 1)) {
                    dp[ind1][ind2] = 1 + dp[ind1 - 1][ind2 - 1];
                } else {
                    dp[ind1][ind2] = Math.max(dp[ind1 - 1][ind2], dp[ind1][ind2 - 1]);
                }
            }
        }

        int i = l1;
        int j = l2;
        StringBuilder ans = new StringBuilder();

        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                ans.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] >= dp[i][j - 1]) {
                ans.append(str1.charAt(i - 1));
                i--;
            } else {
                ans.append(str2.charAt(j - 1));
                j--;
            }
        }

        while (i > 0) {
            ans.append(str1.charAt(i - 1));
            i--;
        }
        while (j > 0) {
            ans.append(str2.charAt(j - 1));
            j--;
        }

        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        String s1 = "brute";
        String s2 = "groot";

        System.out.println("The shortest common super sequence is: " + shortestCommonSupersequence(s1, s2));
    }
}
