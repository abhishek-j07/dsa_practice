package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RowWithMaximum1s {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // Row 1
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1); row1.add(1); row1.add(1);
        matrix.add(row1);

        // Row 2
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(0); row2.add(0); row2.add(1);
        matrix.add(row2);

        // Row 3
        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(0); row3.add(0); row3.add(0);
        matrix.add(row3);

        System.out.println(rowMaxOnes(matrix,3,3));
    }

    public static int rowMaxOnes(ArrayList<ArrayList<Integer>> mat, int n, int m) {

        int ans = Integer.MIN_VALUE;
        int rows = n;
        int cols = m;
        int idx = -1;

        for(int i = 0 ; i < rows ; i++){

            int count = 0;

            count = getNumberOf1s(mat.get(i));

            if(count > ans){
                ans = count;
                idx = i;
            }
        }

        return idx;
    }

    private static int getNumberOf1s(ArrayList<Integer> integers) {

        int lb = 0;

        int l = 0;
        int h = integers.size()-1;

        while(l <= h){

            int mid = (l+h)/2;

            if(integers.get(mid) >= 1){
                lb = mid;
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }

        return (integers.size()-lb)+1;
    }
}
