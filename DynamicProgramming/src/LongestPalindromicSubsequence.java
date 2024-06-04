import java.util.Arrays;

public class LongestPalindromicSubsequence {
    public static int longestPalindromeSubseq(String s) {
     String s2 = new StringBuilder(s).reverse().toString();
        int l1=s.length();
        int l2=s2.length();

        int[][] dp = new int[l1+1][l2+1];
        for (int[] row:
                dp) {
            Arrays.fill(row,-1);
        }
        return lcs(s,s2,l1,l2,dp);
    }

    private static int lcs(String s, String s2, int ind1, int ind2, int[][] dp) {
        if(ind1==0 || ind2==0)
        {
            return 0;
        }
        if (dp[ind1][ind2]!=-1)
        {
            return dp[ind1][ind2];
        }
        if (s.charAt(ind1-1)==s2.charAt(ind2-1))
        {
            dp[ind1][ind2]=1+lcs(s,s2,ind1-1,ind2-1,dp);
        }else
        {
            dp[ind1][ind2] = Math.max(lcs(s, s2, ind1 - 1, ind2, dp), lcs(s, s2, ind1, ind2 - 1, dp));
        }
        return dp[ind1][ind2];
    }

    public static void main(String[] args) {
        String s = "bbabcbcab";
        System.out.println(longestPalindromeSubseq(s));
    }
}
