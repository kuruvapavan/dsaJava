import java.util.Arrays;

class missingNum {
    public static void main(String[] args) {
        int[] arr={4,0,2,1};
        System.out.println(missingNumber(arr));
    }
    public static   int missingNumber(int[] nums) {
//        int i = 0;
//        while (i < arr.length) {
//            int correctIndex = arr[i];
//            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
//                swap(arr, i, correctIndex);
//            } else {
//                i++;
//            }
//        }
//        for (int j = 0; j < arr.length ; j++) {
//            if (arr[j]!=j){
//                return j;
//            }
//        }
//        return arr.length;
//
//    }
//    static void swap(int[] arr, int first, int second){
//        int temp=arr[first];
//        arr[first]=arr[second];
//        arr[second]=temp;
        int i=0;
        while (i<nums.length){
            int correctIndex=nums[i];
            if (nums[i]<nums.length && nums[i]!=nums[correctIndex] ){
                swap(nums,i,correctIndex);
            }else {
                i++;
            }
        }
        for (int j = 0; j <nums.length ; j++) {
            if (nums[j]!=j){
                return j;
            }
        }
        return nums.length;
    }
    static void swap(int[] nums, int start, int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}