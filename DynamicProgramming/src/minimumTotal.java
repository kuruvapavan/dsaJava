import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class minimumTotal {
    public static int minimumTotal(List<List<Integer>> triangle) {
        return recursive(triangle,0,0);
        
    }

    private static int recursive(List<List<Integer>> triangle, int i, int j) {

        if (i==triangle.size())
        {
            return 0;
        }
        int remain=Math.min(recursive(triangle,i+1,j),recursive(triangle,i+1,j+1));

        return triangle.get(i).get(j)+remain;
    }

    public static void main(String[] args) {
       List<List<Integer>> tri= new ArrayList<>();
        tri.add(List.of(2));
        tri.add(List.of(3, 4));
        tri.add(List.of(6, 5, 7));
        tri.add(List.of(4, 1, 8, 3));

        System.out.println(minimumTotal(tri));
        System.out.println(minimumTotal(tri));
    }
    public static int minTotalMemo(List<List<Integer>> tri){
        int[][] dp=new int[tri.size()][tri.get(tri.size()-1).size()];
        for (int [] row:
             dp) {
            Arrays.fill(row,-1);
        }
        return memo(tri,0,0,dp);
    }

    private static int memo(List<List<Integer>> tri, int i, int j, int[][] dp) {
        if (i==tri.size())
        {
            return 0;
        }
        if (dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int remain=Math.min(memo(tri,i+1,j,dp),memo(tri,i+1,j+1,dp));

        dp[i][j]=tri.get(i).get(j)+remain;

        return dp[i][j];
    }

}