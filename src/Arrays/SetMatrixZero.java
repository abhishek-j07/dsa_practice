package Arrays;

import java.util.HashSet;

public class SetMatrixZero {

    public static void main(String[] args) {

        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        SetMatrixZero obj = new SetMatrixZero();
        obj.setZeroes(arr);

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void setZeroes(int[][] matrix) {

        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();
        int r = matrix.length;
        int c = matrix[0].length;

        for(int row = 0 ; row < r ; row++){
            for(int col = 0 ; col < c ; col++){
                if(matrix[row][col] == 0){
                    rowSet.add(row);
                    colSet.add(col);
                }
            }
        }

        for(int row = 0 ; row < r ; row++){
            for(int col = 0 ; col < c ; col++){
                if(rowSet.contains(row) || colSet.contains(col)){
                    matrix[row][col] = 0;
                }
            }
        }
    }
}
