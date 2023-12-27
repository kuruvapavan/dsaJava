public class findMin   {
    public static void main(String[] args) {
        int[] nums ={23,45,-1,2,4,5};
        System.out.println(min(nums));
    }
    static int min(int[] arr){
        int mini= Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<mini){
                mini=arr[i];
            }
        }
        return mini;
    }
}
