package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {

    public static void main(String[] args) {

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int idx = 0;

        findCombinationSum(res,curr,idx,target,candidates);

        return res;
    }

    private void findCombinationSum(List<List<Integer>> res, List<Integer> curr, int idx,
                                    int target, int[] candidates) {

        if(idx==candidates.length){

            if(target==0){
                res.add(new ArrayList<>(curr));
                return;
            }else{
                return;
            }
        }

        if(candidates[idx] <= target) {
            curr.add(candidates[idx]);
            findCombinationSum(res, curr, idx, target - candidates[idx], candidates);
            curr.remove(curr.size()-1);
        }


        findCombinationSum(res,curr,idx+1,target,candidates);


    }
}
