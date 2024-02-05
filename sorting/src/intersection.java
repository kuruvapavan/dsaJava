import java.util.Arrays;
import java.util.HashSet;

class intersection {
    public static void main(String[] args) {
        int[] nums1= {1,2,2,1};
        int[] nums2 ={2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1= new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for (int everyelement: nums1) {
            s1.add(everyelement);

        }
        System.out.println(s1);
        for (int everyelement:nums2) {
            if (s1.contains(everyelement)){
                s2.add(everyelement);
            }

        }
        System.out.println(s2);
        int[] res = new int[s2.size()];
        int i=0;
        for (int j:s2) {
            res[i++]=j;
            
        }
        return res;
    }
}