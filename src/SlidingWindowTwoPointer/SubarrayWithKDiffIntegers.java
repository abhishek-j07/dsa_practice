package SlidingWindowTwoPointer;

import java.util.HashMap;

public class SubarrayWithKDiffIntegers {

    public static void main(String[] args) {

    }

    public int subarraysWithKDistinct(int[] nums, int k) {

        int sum1 = solve(nums, k);
        int sum2 = solve(nums, k-1);

        return sum1-sum2;

    }

    public int solve(int[] nums, int k) {

        int n = nums.length;
        int left = 0;
        int right = 0;
        int c = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(right < n){

            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while(map.size() > k){

                map.put(nums[left], map.get(nums[left]) - 1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }

            c += right - left + 1;

            right++;
        }

        return c;
    }
}
