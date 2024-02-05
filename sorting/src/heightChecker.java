import java.util.Arrays;

class heightChecker {
    public static void main(String[] args) {
        int[] heights ={1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
    public static int heightChecker(int[] heights) {
//        int i=0;
//        int count=0;
//        while (i<heights.length){
//            int correctIndex=heights[i];
//            if (heights[i]!=heights[correctIndex]){
//               count++;
//            }
//        }
//        return count;
//    }
//
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int count=0;
        for (int i = 0; i <heights.length ; i++) {
            if (heights[i]!=expected[i]){
                count++;
            }
        }
        return count;
    }
}