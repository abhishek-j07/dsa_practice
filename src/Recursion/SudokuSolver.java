package Recursion;

public class SudokuSolver {

    public static void main(String[] args) {

    }

    public void solveSudoku(char[][] board) {

        helper(board);

    }

    public boolean helper(char[][] b){

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){

                if(b[i][j] =='.' ){

                    for(char c='1';c<='9';c++){

                        if(isValid(b,i,j,c)){
                            b[i][j]=c;
                            if(helper(b) )
                                return true ;
                            else
                                b[i][j]='.';
                        }
                    }
                    return false;

                }
            }
        }
        return true;
    }

    public boolean isValid(char[][] b, int r, int c, int num){
        for(int i = 0 ; i < b.length ; i++){
            if(b[i][c] == num){
                return false;
            }
        }

        for(int i = 0 ; i < b.length ; i++){
            if(b[r][i] == num){
                return false;
            }
        }

        int nr = r / 3 * 3;
        int nc = c / 3 * 3;

        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                if(b[nr+i][nc+j] == num){
                    return false;
                }
            }
        }

        return true;
    }

}
