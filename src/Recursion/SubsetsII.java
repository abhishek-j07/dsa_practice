package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

    public static void main(String[] args) {

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        findSubset(res,curr,nums,0);

        return res;
    }

    private void findSubset(List<List<Integer>> res, List<Integer> curr, int[] nums, int i) {

        res.add(new ArrayList<>(curr));

        for(int idx = i ; idx < nums.length ; idx++){

            if(idx > i && nums[idx] == nums[idx-1]){
                continue;
            }

            curr.add(nums[idx]);
            findSubset(res,curr,nums,idx+1);
            curr.remove(curr.size()-1);

        }

    }
}
