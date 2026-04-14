package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {

    public static void main(String[] args) {

    }

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int i = 1;

        findCombination(res,curr,i,k,n);

        return res;

    }

    public void findCombination(List<List<Integer>> res,List<Integer> curr,int i,
                                int length,int target) {

        if(curr.size() == length && target==0){
            res.add(new ArrayList<>(curr));
            return;
        }

        if(curr.size() > length && target <= 0){
            return;
        }

        for (int idx = i; idx <= 9; idx++) {

                curr.add(idx);
                findCombination(res, curr, idx + 1, length, target - idx);
                curr.remove(curr.size() - 1);
        }
    }
}
