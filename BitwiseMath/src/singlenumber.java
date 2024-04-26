public class singlenumber {
    public static void main(String[] args) {
        int[] nums={2,2,3,2};
        System.out.println(singleNum(nums));
    }
    static int singleNum(int[] nums)
    {
        int ans=0;
        for (int i = 0; i <32 ; i++) {
            int sum=0;
            for (final int num:
                 nums) {
                sum=sum+num >> i & 1;
            }
            sum=sum%3;
            ans |= sum <<1;
        }
        return ans;
    }
}
