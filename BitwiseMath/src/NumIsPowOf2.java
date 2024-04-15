public class NumIsPowOf2 {
    public static void main(String[] args) {
        System.out.println(powOf2(8));
    }
    static int powOf2(int n){
        int count=0;
        while (n!=0){
            count++;
            n=n&(n-1);
        }
        if (count==1){
            System.out.println("it is a power of 2");
        }else {
            System.out.println("Not a power of 2");
        }
        return count;
    }
}
