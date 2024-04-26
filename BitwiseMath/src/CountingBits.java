class CountingBits {
    public static void main(String[] args) {
        int n =5;
        int[] res= countBits(n);
        for (int num:
             res) {
            System.out.println(num + " ");
        }
    }
    public static  int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int i = 0; i <=n ; i++) {
            ans[i]=countones(i);
        }
        return ans;
    }

    private static int countones(int x) {
        int count=0;
        while (x!=0){
            count+=x&1;
            x=x>>>1;

        }
        return count;
    }
}