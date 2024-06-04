import java.awt.*;
import java.util.Arrays;

class DistinctSubsequences {
//    public static int numDistinct(String s, String t) {
//        int l1=s.length();
//        int l2=t.length();
//
//        return countsub(s,t,l1,l2);
//    }

//    private static int countsub(String s, String t, int l1, int l2) {
//        if (l2==0)
//        {
//            return 1;
//        }
//        if (l1==0)
//        {
//            return 0;
//        }
//        if (s.charAt(l1-1)==t.charAt(l2-1))
//        {
//            return countsub(s,t,l1-1,l2-1)+countsub(s,t,l1-1,l2);
//        }
//        else
//        {
//            return countsub(s,t,l1-1,l2);
//        }
//    }

    public static void main(String[] args) {
        String s="babgbag";
        String t= "bag";
        System.out.println(numDistinct(s,t));
    }
    public static int numDistinct(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        int[][] dp = new int[l1+1][l2+1];
        for (int[] row:
             dp) {
            Arrays.fill(row,-1);
        }

        return countsub(s,t,l1,l2,dp);
    }

    private static int countsub(String s, String t, int l1, int l2, int[][] dp) {
        if (l2==0)
       {
            return 1;
        }
       if (l1==0)
        {
            return 0;
       }

       if (dp[l1][l2]!=-1)
       {
           return dp[l1][l2];
       }
        if (s.charAt(l1-1)==t.charAt(l2-1))
       {
           dp[l1][l2] = countsub(s,t,l1-1,l2-1,dp)+countsub(s,t,l1-1,l2,dp);
       }else
        {
            dp[l1][l2] = countsub(s,t,l1-1,l2,dp);
        }
        return dp[l1][l2];
    }


}