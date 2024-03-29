import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] nums={8,5,9,2,6};
        System.out.println(Arrays.toString(merge(nums)));

    }
//    static int[] merge(int[] nums){
//        if (nums.length==1){
//            return nums;
//        }
//        int mid = nums.length/2;
//
//        int[] left = merge(Arrays.copyOfRange(nums,0,mid));
//        int[] right = merge(Arrays.copyOfRange(nums,mid,nums.length));
//
//        return mergesort(left,right);
//    }
//
//    private static int[] mergesort(int[] first, int[] second) {
//        int[] newArray = new int[first.length+second.length];
//        int i=0;
//        int j=0;
//        int k=0;
//
//        while (i<first.length && j<second.length){
//            if (first[i]<second[j]){
//                newArray[k]=first[i];
//                i++;
//            }else {
//                newArray[k]=second[j];
//                j++;
//            }
//            k++;
//        }
//        //it may be possible that one of the array is not complete
//        //copy the remaining elements
//        while (i<first.length){
//            newArray[k]=first[i];
//            i++;
//            k++;
//        }
//        while (j<second.length){
//            newArray[k]=second[j];
//            j++;
//            k++;
//        }
//        return newArray;
    static int[] merge(int[] nums){
        if (nums.length==1){
            return nums;
        }
        int mid = nums.length/2;
        int[] leftArr= merge(Arrays.copyOfRange(nums,0,mid));
        int[] rightArr = merge(Arrays.copyOfRange(nums,mid,nums.length));

        return mergesort(leftArr,rightArr);
    }

    private static int[] mergesort(int[] leftArr, int[] rightArr) {
        int[] sortedArray = new int[leftArr.length+rightArr.length];
        int i=0,j=0,k=0;
        while (i<leftArr.length && j<rightArr.length){
            if (leftArr[i] < rightArr[j]) {
                sortedArray[k]=leftArr[i];

                i++;
            }else {
                sortedArray[k]=rightArr[j];
                j++;

            }
            k++;
        }
        while (i<leftArr.length){
            sortedArray[k]=leftArr[i];
            k++;
            i++;
        }
        while (j<rightArr.length){
            sortedArray[k]=rightArr[j];
            k++;
            j++;
        }
        return sortedArray;
    }
}
