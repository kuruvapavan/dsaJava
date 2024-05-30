public class PathwithMaximumGold {
    public static void main(String[] args) {
        int[][] grid= {
                {0,6,0},
                {5,8,7},
                {0,9,0}
        };
        System.out.println(getMaximumGold(grid));
    }
    public static int getMaximumGold(int[][] grid) {
        int maxGold=0;

        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if(grid[i][j]!=0){
                    maxGold=Math.max(maxGold,helper(grid,i,j));
                }
            }
        }
        return maxGold;
    }

    private static int helper(int[][] grid, int i, int j) {
        if (i<0 || grid.length-1<i || j <0 || grid[0].length-1 <j || grid[i][j]==0){
            return 0;
        }

        int temp = grid[i][j];

        grid[i][j]=0;

        int up=helper(grid,i-1,j);
        int down=helper(grid,i+1,j);
        int left=helper(grid,i,j-1);
        int right=helper(grid,i,j+1);

        grid[i][j]=temp;

        return Math.max(Math.max(Math.max(left,right),up),down)+temp;
    }
}
