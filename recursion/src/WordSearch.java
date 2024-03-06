class WordSearch {
    public static boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if ((board[i][j] == word.charAt(0)) && search(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean search(char[][] board,int i, int j, String word,int index){
        if (index==word.length()-1){
            return true;
        }
        if(i<0 ||j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(index)){
            return false;
        }
        board[i][j]+=65;
        boolean exists= search(board,i+1,j,word,index+1) ||
                        search(board,i-1,j,word,index+1) ||
                        search(board,i,j+1,word,index+1) ||
                        search(board,i,j-1,word,index+1);
        board[i][j]+=65;

        return exists;
    }


    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','F'}
        };
        String word = "ABCCED";
        System.out.println(exist(board,word));

    }
}