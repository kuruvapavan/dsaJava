import java.util.Arrays;

class relativeSortArray {
    public static void main(String[] args) {
        int[] nums1={28,6,22,8,44,17};
        int[] nums2={22,28,8,6};
        System.out.println(Arrays.toString(relativeSortArray(nums1,nums2)));
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
//        int[] res = new int[arr1.length];
//        int index=0;
//        int k=0;
//        for (int i = 0; i <arr1.length ; i++) {
//            for (int j = 0; j <arr2.length; j++) {
//                if (arr2[j]==arr1[i]){
//                    res[index++]=arr2[j];
//                }
//            }
//        }
////        while (k<arr1.length){
////            res[index++]=arr1[k];
////            k++;
////        }
//        Arrays.sort(r);
//        return res;
        int []res=new int[arr1.length];
        int []f=new int[1001];
        for(int i:arr1){
            f[i]++;
        }
        int i=0,j=0;
        while(i<arr2.length){
            if(f[arr2[i]]>0){
                res[j++]=arr2[i];
                f[arr2[i]]--;
            }else i++;
        }
        i=0;
        while(i<1001){
            if(f[i]>0){
                res[j++]=i;
                f[i]--;
            }else i++;
        }
        return res;
    }
}