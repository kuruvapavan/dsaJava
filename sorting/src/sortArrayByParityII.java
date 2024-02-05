import java.util.Arrays;

class sortArrayByParityII {
    public static void main(String[] args) {
        int[] nums ={4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }
    public static int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        int evenNumber=0;
        int oddNumber=1;
        for (int num:
             nums) {
            if (num%2==0){
                res[evenNumber]=num;
                evenNumber+=2;
            }
            else {
                res[oddNumber]=num;
                oddNumber+=2;
            }
        }
        return res;
    }
}