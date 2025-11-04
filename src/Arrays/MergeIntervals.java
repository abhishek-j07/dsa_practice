package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MergeIntervals {

    public static void main(String[] args) {

        int[][] arr = {{1,4},{2,3}};
        MergeIntervals m = new MergeIntervals();
        int[][] ans = m.merge(arr);
        for(int[] a:ans){
            System.out.println(Arrays.toString(a));
        }
    }

    public int[][] merge(int[][] intervals) {

        int r = intervals.length;
        int c = intervals[0].length;
        int[][] res = new int[r][c];
        ArrayList<int[]> ans = new ArrayList<>();

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0],o2[0]);
            }
        });

        int i = 0;
        int j = i + 1;

        while (i < r-1 && j < r){

            if(intervals[i][1] >= intervals[j][0]){
                intervals[i][1] = Math.max(intervals[i][1],intervals[j][1]);
                j++;
            }else{
                ans.add(intervals[i]);
                i = j;
                j = i + 1;
            }
        }

        ans.add(intervals[i]);

        res = ans.stream().toArray(int[][]::new);

        return res;

    }
}

