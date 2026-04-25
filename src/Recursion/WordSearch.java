package Recursion;

public class WordSearch {

    public static void main(String[] args) {

    }

    public boolean exist(char[][] board, String word) {

        int row = board.length;
        int col = board[0].length;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){

                if(solve(board,word,i,j,0,row,col)){
                    return true;
                }
            }
        }

        return false;

    }

    public boolean solve(char[][] board, String word, int ri, int ci, int wi, int row, int col) {

        if(wi == word.length()){
            return true;
        }

        if(ri >= row || ci >= col || ri < 0 || ci < 0 || board[ri][ci] != word.charAt(wi)) {
            return false;
        }

        char temp = board[ri][ci];
        board[ri][ci] = '#';

        boolean found = solve(board, word, ri-1, ci, wi+1, row, col) ||

                solve(board, word, ri, ci+1, wi+1, row, col) ||

                solve(board, word, ri+1, ci, wi+1, row, col) ||

                solve(board, word, ri, ci-1, wi+1, row, col);


        board[ri][ci] = temp;
        return found;

    }
}
