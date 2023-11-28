public class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int[] row : image) {
            for (int i = 0; i < (n + 1) / 2; i++) {
                // Flip horizontally and invert in one step
                int temp = row[i] ^ 1; // Inverting the i-th element
                row[i] = row[n - 1 - i] ^ 1; // Flipping and inverting the (n-1-i)-th element
                row[n - 1 - i] = temp; // Placing the inverted i-th element at (n-1-i)-th position
            }
        }
        return image;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] image = {{1,1,0},
                        {1,0,1},
                        {0,0,0}};
        int[][] result = solution.flipAndInvertImage(image);
        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
