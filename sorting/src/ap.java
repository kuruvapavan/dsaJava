import java.util.Arrays;

class ap {
    public static void main(String[] args) {
        int[] arr= {3,5,1};
        canMakeArithmeticProgression(arr);
    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i+1]-arr[i]==2){
        //         return true;
        //     }
        // }
        // return false;
        int d=arr[1]-arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=d){
                return false;
            }
        }
        return true;
    }
}