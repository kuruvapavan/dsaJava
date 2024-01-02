//public class BSSortedArray {
//    public static void main(String[] args) {
//
//    }
//    static int[] binarysearch(int[][] arr,int row,int colStart, int colEnd, int target){
//        while (colStart<=colEnd){
//            int mid = colStart + (colEnd-colStart)/2;
//            if (arr[row][mid]==target){
//                return new int[]{row,mid};
//            }
//            if (arr[row][mid]<target){
//                colStart=mid+1;
//            }else {
//                colEnd=mid-1;
//            }
//        }
//        return new int[]{-1,-1};
//    }
//    static int[] search(int[][] arr, int target){
//
//        int row=arr.length;
//        int col=arr[0].length;
//
//        if (row==1){
//            return binarysearch(arr,0,0,col-1,target);
//        }
//        int rStart=0;
//        int rEnd=row-1;
//        int cMid=col/2;
//        while (rStart<(rEnd-1)){
//            int mid=rStart+(rEnd-rStart)/2;
//            if (arr[mid][cMid]==target){
//                return new  int[]{mid,cMid};
//            }
//            if (arr[mid][cMid]<target){
//                rStart=mid;
//            }else {
//                rEnd=mid;
//            }
//        }
//
//        if (arr[rStart][cMid]==target){
//            return new int[]{rStart,cMid};
//        }
//        if (arr[rStart+1][cMid]==target){
//            return new int[]{rStart+1,cMid};
//        }
//        if (target<=arr[rStart][cMid-1]){
//            return binarysearch(arr,rStart,0,cMid-1,target);
//
//        }
//        if (target>=arr[rStart][cMid+1]){
//            return binarysearch(arr,rStart,cMid+1,,target);
//        }
//        if (target<=arr[rStart+1][cMid-1]){
//            return binarysearch(arr,rStart,0,cMid-1,target);
//        }
//        if (target<=arr[rStart][cMid+1]){
//            return binarysearch(arr,rStart,0,cMid-1,target);
//        }
//
//
//    }
//
//}
