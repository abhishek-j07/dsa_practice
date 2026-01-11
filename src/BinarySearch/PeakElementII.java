package BinarySearch;

public class PeakElementII {

    public static void main(String[] args) {

        int[][] matrix = {{1,4},{3,2}};
        PeakElementII p = new PeakElementII();
        int[] ans = p.findPeakGrid(matrix);

        for(Integer i:ans){
            System.out.print(i+" ");
        }
    }

    public int[] findPeakGrid(int[][] mat) {

        int row = mat.length;
        int col = mat[0].length;

        int l = 0;
        int h = col-1;

        while (l <= h){

            int mid = (l+h)/2;

            int getMax = getMaxFromColumn(mat,mid);

            int left = mid-1 >= 0 ? mat[getMax][mid-1] : -1;
            int right = mid + 1 < col ? mat[getMax][mid + 1] : -1;

            if(mat[getMax][mid] > left && mat[getMax][mid] > right){
                return new int[]{getMax,mid};
            }else if(mat[getMax][mid] < left){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }

        return new int[]{-1,-1};

    }

    private int getMaxFromColumn(int[][] mat, int col) {

        int max = -1;
        int maxElement = 0;

        for(int i = 0 ; i < mat.length ; i++){
            if(mat[i][col] > maxElement){
                maxElement = mat[i][col];
                max = i;
            }
        }

        return max;
    }
}
