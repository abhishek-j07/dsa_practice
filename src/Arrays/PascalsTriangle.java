package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {

        PascalsTriangle triangle = new PascalsTriangle();
        System.out.println(triangle.generate(5));
    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    row.add(1);
                }else {
                    int upperRightElement = res.get(i - 1).get(j - 1);
                    int upperElement = res.get(i - 1).get(j);
                    row.add(upperElement + upperRightElement);
                }
            }

            res.add(row);
        }

        return res;
    }
}
