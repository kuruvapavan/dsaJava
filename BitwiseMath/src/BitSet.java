public class BitSet {
    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
     }
    public  static int hammingWeight(int n) {
        int c=0;

        while (n!=0)
        {
            n=n&(n-1);
            c++;
        }
        return c;
    }
}
