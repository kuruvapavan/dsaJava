public class FIndUnique {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,3,4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique=0;
        for (int n:arr ) {
            unique=unique^n;
        }
        return unique;
    }

}

