//import java.util.ArrayList;
//
//class allCellsDistOrder {
//    public static void main(String[] args) {
//        int rows = 1, cols = 2, rCenter = 0, cCenter = 0;
//    }
//    public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
//        ArrayList<int[]> result = new ArrayList<>();
//
//        // Generate all coordinates
//        for (int r = 0; r < rows; r++) {
//            for (int c = 0; c < cols; c++) {
//                result.add(new int[]{r, c});
//            }
//        }
//
//        // Sort by Manhattan distance
//        result.sort(Comparator.comparingInt(a -> Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter)));
//
//        // Convert list to array
//        return result.toArray(new int[result.size()][2]);
//    }
//}