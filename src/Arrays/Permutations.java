package Arrays;

import java.util.ArrayList;
import java.util.List;

import static Sorting.RecursiveBubbleSort.swap;


public class Permutations {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        List<List<Integer>> res = new ArrayList<>();
        permuteUnique(arr,res,0);

        System.out.println(res);
    }

    public static void permuteUnique(int[] nums, List<List<Integer>> result, int idx) {

        if(idx == nums.length){
            List<Integer> list = new ArrayList<>();
            for(Integer num : nums){
                list.add(num);
            }

            result.add(list);
            return;
        }

        for(int i = idx; i < nums.length; i++){
            swap(nums,idx,i);
            permuteUnique(nums, result, idx+1);
            swap(nums,idx,i);
        }
    }
}
