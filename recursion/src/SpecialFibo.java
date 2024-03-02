public class SpecialFibo {
    public static void main(String[] args) {
        System.out.println(specialfibo(1,2,1));
    }
    static int specialfibo(int A, int B, int N){

        if (N==0){
            return A;
        }
        if (N==1){
            return B;
        }

        return specialfibo(A,B,N-1) ^ specialfibo(A,B,N-2);
    }

}
