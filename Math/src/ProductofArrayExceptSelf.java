import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums={-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        int pro=1;
        for (int i:
             nums) {
            pro*=i;
        }
        for (int i = 0; i <n ; i++) {
            ans[i]=pro/nums[i];
        }
        return ans;
    }
}
