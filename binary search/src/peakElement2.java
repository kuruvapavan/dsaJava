class PeakElementFinder {
    public static int findMaxIndex(int[][] mat, int n, int m, int col) {
        int maxValue = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (mat[i][col] > maxValue) {
                maxValue = mat[i][col];
                index = i;
            }
        }
        return index;
    }

    public static int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int start = 0;
        int end = m - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int maxRowIndex = findMaxIndex(mat, n, m, mid);

            int left = mid - 1 >= 0 ? mat[maxRowIndex][mid - 1] : Integer.MIN_VALUE;
            int right = mid + 1 < m ? mat[maxRowIndex][mid + 1] : Integer.MIN_VALUE;

            if (mat[maxRowIndex][mid] > left && mat[maxRowIndex][mid] > right) {
                return new int[]{maxRowIndex, mid};
            } else if (mat[maxRowIndex][mid] < left) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }
}

public class peakElement2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {47, 30, 35, 8, 25},
                {6, 36, 19, 41, 40},
                {24, 37, 13, 46, 5},
                {3, 43, 15, 50, 19},
                {6, 15, 7, 25, 18}
        };

        int[] peakCoordinates = PeakElementFinder.findPeakGrid(matrix);

        System.out.println("Peak coordinates: [" + peakCoordinates[0] + ", " + peakCoordinates[1] + "]");
    }
}
