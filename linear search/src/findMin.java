public class findMin   {
    public static void main(String[] args) {
        int[] nums ={23,45,1,2,4,5};
        System.out.println(min(nums));
    }
    static int min(int[] arr){
        //int mini= Integer.MAX_VALUE;
        int ans=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
