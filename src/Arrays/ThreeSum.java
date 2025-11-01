package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {

        int[] arr = {-1,0,1,2,-1,-4};
        ThreeSum threeSum = new ThreeSum();
        System.out.println(threeSum.threeSum(arr));
    }

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;


        for(int i = 0 ; i < n ; i++){

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int j = i+1;
            int k = n-1;

            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {

                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    res.add(list);

                    j++;
                    k--;

                    while (j < k && nums[j - 1] == nums[j]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;

                } else if (sum > 0) {

                    k--;

                } else {

                    j++;
                }
            }
        }

        return res;
    }
}
