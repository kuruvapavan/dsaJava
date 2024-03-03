public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println(sortedOrNo(arr,arr.length-1));
    }
    public static boolean sortedOrNo(int[] array, int index) {
        if (index == array.length - 1 || array.length == 0) {
            return true;
        }
        if (array[index] > array[index + 1]) {
            return false;
        }
        return sortedOrNo(array, index + 1);
    }

}
