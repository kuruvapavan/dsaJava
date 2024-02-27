import java.util.ArrayList;
import java.util.Arrays;

public class maze {
    public static void main(String[] args) {
        System.out.println(count(3, 3)); // Prints the count of paths
        mazePath("", 3, 3); // Prints paths without indices
        System.out.println(count(3, 3)); // Prints the count of paths again (this line is redundant and can be removed)
        mazePath("", 3, 3, 1, 1); // Prints paths with indices
        System.out.println(mazeDiagonal("", 3, 3));

        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        mazeWithRestrictions("", board, 0, 0);
        AllDirectiins("", board, 0, 0);

        int[][] path = new int[board.length][board[0].length];
        AllPathSteps("",board,0,0,path,1);
    }

    // Method to count the number of paths
    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }

    // Method to print all paths without indices
    static void mazePath(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            mazePath(p + 'D', r - 1, c);
        }
        if (c > 1) {
            mazePath(p + 'R', r, c - 1);
        }
    }

    // Overloaded method to print all paths with indices
    static void mazePath(String p, int r, int c, int currentRow, int currentCol) {
        if (currentRow == r && currentCol == c) {
            System.out.println(p + "(" + currentRow + "," + currentCol + ")");
            return;
        }
        if (currentRow < r) {
            mazePath(p + "(" + currentRow + "," + currentCol + ")" + "->D", r, c, currentRow + 1, currentCol);
        }
        if (currentCol < c) {
            mazePath(p + "(" + currentRow + "," + currentCol + ")" + "->R", r, c, currentRow, currentCol + 1);
        }
    }

    static ArrayList<String> mazeDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1 && c > 1) {
            list.addAll(mazeDiagonal(p + 'D', r - 1, c - 1));
        }
        if (r > 1) {
            list.addAll(mazeDiagonal(p + 'V', r - 1, c));
        }
        if (c > 1) {
            list.addAll(mazeDiagonal(p + 'H', r, c - 1));
        }
        return list;
    }

    static void mazeWithRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (maze[r][c] == false) {
            return;
        }
        if (r < maze.length - 1) {
            mazeWithRestrictions(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            mazeWithRestrictions(p + 'R', maze, r, c + 1);
        }

    }

    static void AllDirectiins(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        // considering this block in my path
        maze[r][c] = false;

        if (r < maze.length - 1) {
            AllDirectiins(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            AllDirectiins(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            AllDirectiins(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            AllDirectiins(p + 'L', maze, r, c - 1);
        }
        // this line is where the function wil be over
        // so before the function gets removed, also remove the changes that were made by the function
        maze[r][c] = true;
    }

    static void AllPathSteps(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c]=step;
            for (int[] arr:
                 path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();

        }
        if (!maze[r][c]) {
            return;
        }
        // considering this block in my path
        maze[r][c] = false;
        path[r][c]=step;

        if (r < maze.length - 1) {
            AllPathSteps(p + 'D', maze, r + 1, c, path, step + 1);
        }
        if (c < maze[0].length - 1) {
            AllPathSteps(p + 'R', maze, r, c +1, path, step + 1);
        }
        if (r > 0) {
            AllPathSteps(p + 'U', maze, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            AllPathSteps(p + 'L', maze, r, c - 1, path, step + 1);
        }
        // this line is where the function wil be over
        // so before the function gets removed, also remove the changes that were made by the function
        maze[r][c] = true;
        path[r][c]=0;
    }
}
