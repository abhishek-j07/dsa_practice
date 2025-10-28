package Arrays;

public class RotateImage {

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        RotateImage r = new RotateImage();
        r.rotate(matrix);

    }

    public void rotate(int[][] matrix) {

        transpose(matrix);

        for(int i = 0; i < matrix.length; i++){
            reverse(matrix[i]);
        }
    }

    public void transpose(int[][] matrix) {

        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = i ; j < matrix[0].length ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void reverse(int[] arr){

        int n = arr.length;
        int s = 0;
        int e = n-1;

        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
    }
}
