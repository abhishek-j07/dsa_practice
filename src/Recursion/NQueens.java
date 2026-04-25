package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

    public static void main(String[] args) {

    }

    public List<List<String>> solveNQueens(int n) {


        List<List<String>> result = new ArrayList<>();

        int[] leftRow = new int[n];
        int[] leftUpperDiagonal = new int[2*n-1];
        int[] leftLowerDiagonal = new int[2*n-1];
        char[][] board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');

        solve(0,n,leftRow,leftUpperDiagonal,leftLowerDiagonal,result,board);

        return result;

    }

    private void solve(int col, int n, int[] leftRow, int[] leftUpperDiagonal,
                       int[] leftLowerDiagonal, List<List<String>> result, char[][] board) {

        if(col == n){

            List<String> list = new ArrayList<>();

            for(int i = 0; i < n; i++){
                list.add(new String(board[i]));
            }

            result.add(list);
            return;
        }

        for(int row = 0; row < n; row++){

            if(leftRow[row] == 0 && leftLowerDiagonal[row+col] == 0 &&
                    leftUpperDiagonal[n-1+col-row] == 0){


                board[row][col] = 'Q';
                leftRow[row] = 1;
                leftLowerDiagonal[row+col] = 1;
                leftUpperDiagonal[n-1+col-row] = 1;

                solve(col+1,n,leftRow,leftUpperDiagonal,leftLowerDiagonal,result,board);

                board[row][col] = '.';
                leftRow[row] = 0;
                leftLowerDiagonal[row+col] = 0;
                leftUpperDiagonal[n-1+col-row] = 0;
            }
        }
    }

}
