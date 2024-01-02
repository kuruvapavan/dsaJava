public class maxWealth {
    public static void main(String[] args) {
     int[][] acc={
            {1,2,3},
            {4,5,6}
        };
        System.out.println(maximumWealth(acc));
    }

    public static int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <accounts.length ; i++) {
            int sum=0;
            for (int j = 0; j <accounts[0].length ; j++) {
                sum+=accounts[i][j];
            }
            if (sum>max){
                max=sum;
            }
        }
        return max;

    }
}
