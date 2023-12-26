public class minAndMaxelements {
    public static void main(String[] args) {
        int[] a ={1,4,4,6,-50,10,2};
        int n =a.length;
        System.out.println(min(a,n));
        System.out.println(max(a,n));
    }
    static int min(int[] a, int n){
        if (n==1){
            return a[0];
        }
        return  Math.min(a[n-1],min(a,n-1));
    }
    static int max(int[]a , int n){
        if (n==1){
            return a[0];
        }
        return Math.max(a[n-1],max(a,n-1));
    }
}
