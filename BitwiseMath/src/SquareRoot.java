public class SquareRoot {
    public static void main(String[] args) {
    int n =25;
        System.out.println(perfectSquare(n));
    }
    static int perfectSquare(int n){
        if (n<2){
            return n;
        }
        int s=1, end=n;
        while (s<=end){
            int mid = (s+end)/2;
            if (mid*mid==n){
                return mid;
            } else if (mid*mid<n) {
                s=mid+1;
            }else {
                end=mid-1;
            }
        }
        return end;
    }

}
