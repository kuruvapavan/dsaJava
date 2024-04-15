class singleNumber {
    public static int singleNumber(int[] nums) {
        int unique=0;
        for(int n : nums){
            unique^=n;
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] nums={2,2,1};
        System.out.println(singleNumber(nums));
    }
}