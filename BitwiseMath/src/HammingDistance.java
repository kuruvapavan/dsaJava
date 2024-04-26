class HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
    public static int hammingDistance(int x, int y) {
       int xor=x^y;
       return countBits(xor);
    }
    public static int countBits(int n){
        int c=0;
        while (n!=0)
        {
            c+=n&1;
            n>>>=1;
        }
        return c;
    }
}