public class linearSearch {
    public static void main(String[] args) {
    int[] nums ={23,45,1,2,4,5};
    int target=21;
    int ans =search(nums,target);
        System.out.println(ans);
    }
    // search in the array: return the index if item found

    static int search(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i <arr.length ; i++) {
            int element=arr[i];
            if (element==target){
                return i;
            }
        }
        return -1;
    }
}
