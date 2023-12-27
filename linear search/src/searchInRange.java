public class searchInRange {
    public static void main(String[] args) {
        int[] nums ={23,45,1,2,4,5};
        int target=5;
        int ans =search(nums,target,1,4);
        System.out.println(ans);
    }

    static int search(int[] arr, int target,int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <=end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
