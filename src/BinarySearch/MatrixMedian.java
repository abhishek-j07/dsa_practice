package BinarySearch;

public class MatrixMedian {

    public static void main(String[] args) {

        int[][] matrix = {{1,4,9},{2,5,6},{3,7,8}};

        System.out.println(findMedian(matrix,3,3));
    }

    public static int findMedian(int matrix[][], int m, int n) {

        int low = matrix[0][0];
        int high = matrix[0][n - 1];
        for (int i = 1; i < m; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][n - 1]);
        }
        int req = (m*n+1)/2;

        while(low < high){

            int mid = low + (high - low)/2;

            int countLessOrEqual = getLessOrEqual(matrix,mid);

            if(countLessOrEqual < req){
                low = mid + 1;
            }else{
                high = mid;
            }
        }

        return low;
    }

    private static int getLessOrEqual(int[][] matrix, int mid) {

        int count = 0;

        for(int i = 0; i < matrix.length; i++){

            int getLessThan = upperBound(matrix[i],mid);
            count += getLessThan;
        }

        return count;
    }

    private static int upperBound(int[] arr, int x){

        int ans = arr.length;
        int l = 0;
        int h = arr.length-1;

        while(l <= h){

            int mid = l + (h - l)/2;

            if(arr[mid] > x){
                ans = mid;
                h = mid - 1;
            }else {
                l = mid + 1;
            }
        }

        return ans;
    }
}
