package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

    public static void main(String[] args) {

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int idx = 0;
        Arrays.sort(candidates);

        findCombination(res,curr,idx,target,candidates);

        return res;
    }

    private void findCombination(List<List<Integer>> res, List<Integer> curr, int idx,
                                 int target, int[] candidates) {

        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i = idx ; i < candidates.length; i++){

            if(i > idx && candidates[i] == candidates[i-1]){
                continue;
            }

            if(candidates[i] > target){
                break;
            }

            curr.add(candidates[i]);
            findCombination(res,curr,i+1,target-candidates[i],candidates);
            curr.remove(curr.size()-1);
        }
    }
}
