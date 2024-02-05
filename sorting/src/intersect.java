import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class intersect {
    public static void main(String[] args) {
        int[] nums1={1,2,2,4};
        int[] nums2={2,2,4};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
    public  static int[] intersect(int[] nums1, int[] nums2) {
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // int i=0;
        // int j=0;
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // while(i<nums1.length && j<nums2.length){
        //     if(nums1[i]<nums2[j]){
        //         i++;
        //     }
        //     else if(nums1[i]>nums2[j]){
        //         j++;
        //     }
        //     else{
        //         arr.add(nums1[i]);
        //         i++;
        //         j++;
        //     }

        // }
        // int[] ans = new int[arr.size()];
        // int k=0;
        // while(k<arr.size()){
        //     ans[k]=arr.get(k);
        //     k++;
        // }
        // return ans;
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        //counting the occurences of each element in nums1;
        for (int i: nums1) {
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i,1);
            }

        }
        //check each element of num2 against the map
        for (int i:
             nums2) {
            if (map.containsKey(i) && map.get(i)>0){
                result.add(i);
                map.put(i,map.get(i)-1);

            }

        }
        int[] intersection = new int[result.size()];
        int ind=0;
        for (int i:
             result) {
            intersection[ind++]=i;

        }
        return intersection;
        
    }
}