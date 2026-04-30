package Recursion;

public class MColoring {

    public static void main(String[] args) {

    }

    public static String graphColoring(int [][]mat, int m) {

        int color[] = new int[mat.length];

        if(solve(mat,color,m,0)){
            return "YES";
        }

        return "NO";
    }

    public static boolean solve(int[][] mat, int[] color, int m, int row){

        if(row == mat.length){
            return true;
        }

        for(int i = 1 ; i <= m ; i++){

            if(isCorrect(mat,row,color,i)){
                color[row] = i;
                if(solve(mat, color, m, row + 1)){
                    return true;
                }
                color[row] = 0;
            }
        }

        return false;
    }


    private static boolean isCorrect(int[][] mat, int cur, int[] color, int col) {
        for (int i = 0; i < mat.length; i++) {
            if (mat[cur][i] == 1 && color[i] == col) {
                return false;
            }
        }
        return true;
    }
}
