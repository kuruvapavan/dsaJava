public class FindXORSumofAllPairsBitwiseAND {
    public static void main(String[] args) {
        int[] a ={1,2,3};
        int[] b = {6,5};
        System.out.println(getXORSum(a,b));

    }
    static int getXORSum(int[] a, int[] b){
        return xor(a)&xor(b);
    }
    public static int xor(int[] x){
        int ans=0;
        for (int i:
             x) {
            ans=ans^i;
        }
        return ans;
    }

}
