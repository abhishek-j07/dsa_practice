package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        System.out.println(spiralMatrix.spiralOrder((matrix)));
    }

    public List<Integer> spiralOrder(int[][] matrix) {

        int rs = 0;
        int cs = 0;
        int re =  matrix.length - 1;
        int ce = matrix[0].length - 1;
        List<Integer> result = new ArrayList<>();

        while (rs  <= re && cs <= ce) {

            for(int i = cs ; i <= ce; i++){
                result.add(matrix[rs][i]);
            }

            rs++;

            for(int i = rs ; i <= re; i++){
                result.add(matrix[i][ce]);
            }

            ce--;

            if(rs < re) {
                for (int i = ce; i >= cs; i--) {
                    result.add(matrix[re][i]);
                }

                re--;
            }

            if(cs < ce) {
                for (int i = re; i >= rs; i--) {
                    result.add(matrix[i][cs]);
                }

                cs++;
            }
        }

        return result;
    }
}
