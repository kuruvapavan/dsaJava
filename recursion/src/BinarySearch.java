public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target=9;
        System.out.println(search(arr,target));

    }
//    static int search(int[] arr, int target,int start, int end){
//        if (start>end){
//            return -1;
//        }
//        int mid = start+(end-start)/2;
//        if (arr[mid]==target)
//            return mid;
//        if (arr[mid]<target)
//            return search(arr,target,mid+1,end);
//        else
//            return search(arr,target,start,mid-1);
//    }
public static int search(int[] nums, int target){
        return  helper(nums,target,0,nums.length-1);
}

    private static int helper(int[] nums, int target, int s, int e) {
        if (s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if (target==nums[m])
            return m;
        if (target>nums[m]) {
            return helper(nums,target,m+1,e);
        }
        return helper(nums,target,s,m-1);
    }
}
