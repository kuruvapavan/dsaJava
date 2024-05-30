import java.util.Arrays;

class longestCommonSubsequence {
//    public static int longestCommonSubsequence(String text1, String text2) {
//        int l1=text1.length();
//        int l2=text2.length();
//
//        return lcsHelper(text1,text2,l1,l2);
//    }

//    private  static int lcsHelper(String text1, String text2, int l1, int l2) {
//        if (l1==0 || l2==0)
//        {
//            return 0;
//        }
//        if (text1.charAt(l1-1)==text2.charAt(l2-1))
//        {
//            return 1+lcsHelper(text1,text2,l1-1,l2-1);
//        }else {
//            return Math.max(lcsHelper(text1,text2,l1-1,l2),lcsHelper(text1,text2,l1,l2-1));
//        }
//    }
    public static void main(String[] args) {

        String text1 = "abc";
        String text2 = "aced";
        //System.out.println(longestCommonSubsequence(text1, text2));
    }
    public static int longestCommonSubsequence(String text1, String text2)
    {
        int l1=text1.length();
        int l2=text2.length();

        int[][] dp = new int[l1][l2];
        for (int[] row:
             dp) {
            Arrays.fill(row,-1);
        }
        return lcsHelper(text1,text2,l1,l2,dp);
    }

    private static int lcsHelper(String text1, String text2, int l1, int l2, int[][] dp) {
        if (l1<0 || l2<0)
        {
            return 0;
        }
        if (dp[l1][l2]!=1)
        {
            return dp[l1][l2];
        }
        if (text1.charAt(l1-1)==text2.charAt(l2-1))
        {
            return dp[l1][l2]=1+lcsHelper(text1,text2,l1-1,l2-1,dp);
        }
        else {
            return dp[l1][l2]=Math.max(lcsHelper(text1,text2,l1-1,l2,dp),lcsHelper(text1,text2,l1,l2-1,dp));
        }
    }
}