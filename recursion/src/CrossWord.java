import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CrossWord {

    public static boolean success = false;

    public static boolean isOk(String tmp, String word) {
        for (int i = 0; i < tmp.length(); i++) {
            char c1 = tmp.charAt(i);
            char c2 = word.charAt(i);
            if (c1 != '-' && c1 != c2) {
                return false;
            }
        }
        return true;
    }

    public static void fillIn(int starti, int startj, String word, char[][] board, char symbol) {
        if (symbol == '-') {
            for (int j = startj; j < startj + word.length(); j++) {
                board[starti][j] = word.charAt(j - startj);
            }
        } else if (symbol == '|') {
            for (int i = starti; i < starti + word.length(); i++) {
                board[i][startj] = word.charAt(i - starti);
            }
        }
    }

    public static void fill(int starti, int startj, char[][] board, boolean[] visited, String[] wordList, int turn) {
        if (turn == 0) {
            success = true;
            return;
        }
        int i = 0, j = 0;
        boolean find = false;
        for (i = starti; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if (j + 1 < 10 && board[i][j] != '+' && board[i][j + 1] == '-') {
                    find = true;
                    break;
                }
                if (i + 1 < 10 && board[i][j] != '+' && board[i + 1][j] == '-') {
                    find = true;
                    break;
                }
            }
            if (find) break;
        }
        if (!find) {
            success = true;
            return;
        }
        String tmp = "";
        for (int x = j; x < 10 && board[i][x] != '+'; x++) {
            tmp += board[i][x];
        }
        for (int x = 0; x < wordList.length; x++) {
            if (!visited[x] && wordList[x].length() == tmp.length() && isOk(tmp, wordList[x])) {
                visited[x] = true;
                fillIn(i, j, wordList[x], board, '-');
                fill(i, j + 1, board, visited, wordList, turn - 1);
                if (success) return;
                fillIn(i, j, tmp, board, '-');
                visited[x] = false;
            }
        }
    }

    public static List<String> crosswordPuzzle(List<String> crossword, String words) {
        List<String> res = new ArrayList<>();
        String[] wordList = words.split(";");
        char[][] board = new char[10][10];
        boolean[] visited = new boolean[wordList.length];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = crossword.get(i).charAt(j);
            }
        }

        fill(0, 0, board, visited, wordList, wordList.length);
        if (success) {
            for (int i = 0; i < 10; i++) {
                String tmp = "";
                for (int j = 0; j < 10; j++) {
                    tmp += board[i][j];
                }
                res.add(tmp);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> crossword = Arrays.asList(
                "+-++++++++",
                "+-++++++++",
                "+-------++",
                "+-++++++++",
                "+-++++++++",
                "+------+++",
                "+-+++-++++",
                "+++++-++++",
                "+++++-++++",
                "++++++++++"
        );
        String words = "AGRA;NORWAY;ENGLAND;GWALIOR";
        List<String> solution = crosswordPuzzle(crossword, words);

        for (String row : solution) {
            System.out.println(row);
        }
    }
}
