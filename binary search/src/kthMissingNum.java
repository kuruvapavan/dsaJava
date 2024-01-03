public class kthMissingNum {
    public static void main(String[] args) {
        kthMissingNum kthMissingNum = new kthMissingNum();

        // Test cases
        int[] arr1 = {2, 3, 4, 7, 11};
        int k1 = 5;

        int[] arr2 = {1, 2, 3, 4};
        int k2 = 2;

        System.out.println("Kth positive for test case 1: " + kthMissingNum.findKthPositive(arr1, k1));
        System.out.println("Kth positive for test case 2: " + kthMissingNum.findKthPositive(arr2, k2));
    }

    public int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] - mid - 1 < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start + k;
    }
}
