public class kthGrammar {
    public static void main(String[] args) {
        System.out.println(kthGrammar(2,2));
    }
    public static int kthGrammar(int n, int k) {
        return Grammerhelper(n,k);
    }

    private  static int Grammerhelper(int n, int k) {
        if (n==1 && k ==1){
            return 0;
        }
        int mid = (int)Math.pow(2,n-1)/2;

        if (k<=mid){
            return Grammerhelper(n-1,k);
        }else {
            int result = Grammerhelper(n-1,k-mid);
            return (result==0) ? 1 : 0;
        }
    }
}
