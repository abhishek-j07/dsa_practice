package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubsetSum1 {

    public static void main(String[] args) {
    }

    public static ArrayList<Integer> subsetSum(int num[]) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        ArrayList<Integer> sumList = new ArrayList<>();
        int sum = 0;
        findSubsetSum(res,curr,sumList,num,0,sum);

        Collections.sort(sumList);
        return sumList;
    }

    private static void findSubsetSum(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> curr,
                                      ArrayList<Integer> sumList, int[] num, int i, int sum) {

        if(i == num.length){

            res.add(new ArrayList<>(curr));
            sumList.add(sum);
            return;
        }

        curr.add(num[i]);
        sum += num[i];
        findSubsetSum(res,curr,sumList,num,i+1,sum);
        sum  -= num[i];
        curr.remove(curr.size()-1);

        findSubsetSum(res,curr,sumList,num,i+1,sum);

    }
}
