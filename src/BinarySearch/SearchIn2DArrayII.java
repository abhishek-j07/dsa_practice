package BinarySearch;

public class SearchIn2DArrayII {

    public static void main(String[] args) {

        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        SearchIn2DArrayII search = new SearchIn2DArrayII();
        System.out.println(search.searchMatrix(matrix, 230));
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        boolean isPresent = false;
        int row = matrix.length-1;
        int col = matrix[0].length-1;

        int startRow = 0;
        int startCol = col;

        while (startRow <= row && startCol >= 0) {

            if(matrix[startRow][startCol] == target){
                return true;
            }else if(matrix[startRow][startCol] < target){
                startRow++;
            }else {
                startCol--;
            }
        }

        return isPresent;
    }
}
