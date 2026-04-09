package Recursion;

import java.util.ArrayList;

public class SubsequencesWithSumK {

    public static void main(String[] args) {

    }

    public int countSubsequenceWithTargetSum(int[] nums, int k) {

        int sum = 0;
        int i = 0;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        return subsequencesWithSumK(i,nums,k,sum,res,curr);

    }

    public int subsequencesWithSumK(int i, int[] nums,int k,int sum, ArrayList<ArrayList<Integer>> res,
                                    ArrayList<Integer> curr) {

        if(i == nums.length){
            if(sum == k) {
                res.add(new ArrayList<>(curr));
                return 1;
            }else{
                return 0;
            }
        }

        curr.add(nums[i]);
        sum+=nums[i];
        int l = subsequencesWithSumK(i+1,nums,k,sum,res,curr);

        curr.remove(curr.size()-1);
        sum -= nums[i];

        int r = subsequencesWithSumK(i+1,nums,k,sum,res,curr);

        return l + r;
    }
}
