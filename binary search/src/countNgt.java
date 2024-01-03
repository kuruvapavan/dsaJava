public class countNgt {
    public int countNegatives(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;

        for (int i = 0; i < row; i++) {
            int left = 0;
            int right = col - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (grid[i][mid] < 0)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            count += (col - left);
        }
        return count;
    }

    public static void main(String[] args) {
        // Example usage
        int[][] exampleGrid = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };

        countNgt countNgt = new countNgt();
        int result = countNgt.countNegatives(exampleGrid);

        System.out.println("Number of negative numbers: " + result);
    }
}
