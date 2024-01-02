public class RBS {
    public static void main(String[] args) {
        int[] arr ={4,5,6,7,0,1,2};
        System.out.println(search(arr,0));
    }
//    public static int search(int[] nums, int target){
//        int pivot= findPivot(nums);
//        if (pivot==-1){
//            return bssearch(nums,target,0,nums.length-1);
//        }
//        if (nums[pivot]==target){
//            return pivot;
//        }
//        if (target>=nums[0]){
//            return bssearch(nums,target,0,pivot-1);
//
//        }
//        return bssearch(nums,target,pivot+1,nums.length-1);
//    }
//    static int bssearch(int[] arr, int target,int start,int end) {
//
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }
//
//        }
//        return -1;
//    }
//
//    static int findPivot(int[] arr){
//        int start=0;
//        int end=arr.length-1;
//        while (start<=end){
//            int mid = start + (end-start)/2;
//
//            if (mid<end && arr[mid]>arr[mid+1]){
//                return mid;
//            }
//            if (mid>start && arr[mid]<arr[mid-1]){
//                return mid-1;
//            }
//            if (arr[mid]<=arr[start]){
//                end=mid-1;
//            }else {
//                start=mid+1;
//            }
//        }
//        return -1;
//    }
//}

    public  static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check which half is sorted
            if (nums[start] <= nums[mid]) { // Left half is sorted
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // Right half is sorted
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
