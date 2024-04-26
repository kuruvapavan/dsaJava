import java.util.Arrays;

class sortByBits {
    public static int[] sortByBits(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=Integer.bitCount(arr[i])*10001;
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]%10001;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr ={0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }
}