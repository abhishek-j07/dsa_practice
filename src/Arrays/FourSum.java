package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formattable;
import java.util.List;

public class FourSum {

    public static void main(String[] args) {

        int[] arr = {1,0,-1,0,-2,2};
        FourSum fourSum = new FourSum();
        System.out.println(fourSum.fourSum(arr,0));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0 ; i < n ; i++){

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }


            for(int j = i + 1; j < n; j++){

                if(j > i + 1 && nums[j] == nums[j-1]){
                    continue;
                }

                int k = j+1;
                int l = n-1;

                while (k < l) {

                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum < target) {
                        k++;
                    } else if (sum > target) {
                        l--;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        res.add(list);

                        k++;
                        l--;

                        while (k < l && nums[k] == nums[k - 1]) {
                            k++;
                        }

                        while (k < l && nums[l] == nums[l + 1]) {
                            l--;
                        }
                    }
                }
            }
        }

        return res;
    }
}
