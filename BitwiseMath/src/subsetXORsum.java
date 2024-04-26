class subsetXORsum {
    public static void main(String[] args) {
        int[] nums={1,3};
        System.out.println(subsetXORSum(nums));
    }
    public static int subsetXORSum(int[] nums) {
        return  helper(nums,0,0);
    }

    private static int helper(int[] nums, int index, int currentXOR) {
        if (index==nums.length){
            return currentXOR;
        }
        int withElement=helper(nums,index+1,currentXOR^nums[index]);
        int withoutElement=helper(nums,index+1,currentXOR);

        return withElement+withoutElement;
    }
}