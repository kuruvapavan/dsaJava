class countPrimeSetBits {
    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(6,10));
    }
    public static int countPrimeSetBits(int left, int right) {
        int primeCount=0;
        for (int i = left; i <=right ; i++) {
            int setbitcount = Integer.bitCount(i);
            if (isPrime(setbitcount)){
                primeCount++;
            }
        }
        return primeCount;
    }
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i = 2; i <=n ; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}