import java.util.HashSet;

class containsDuplicate {
    public static void main(String[] args) {
        int[] nums ={1,2,3,1};
        containsDuplicate(nums);
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }


}