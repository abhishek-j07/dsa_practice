package BinarySearch;

public class SearchIn2DArray {

    public static void main(String[] args) {

        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        SearchIn2DArray search = new SearchIn2DArray();
        System.out.println(search.searchMatrix(matrix, 20));
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        boolean isPresent = false;
        int r = matrix.length - 1;
        int c = matrix[0].length - 1;

        int l = 0;
        int h = ((r+1)*(c+1))-1;

        while(l <= h){

            int mid = l + (h - l)/2;
            int row = mid/(c+1);
            int col = mid%(c+1);

            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                l = mid+1;
            }else{
                h = mid-1;
            }
        }

        return isPresent;
    }
}
