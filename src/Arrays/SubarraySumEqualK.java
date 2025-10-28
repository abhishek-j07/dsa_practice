package Arrays;

import java.util.HashMap;

public class SubarraySumEqualK {

    public static void main(String[] args) {

        int[] arr = {1,1,1};
        SubarraySumEqualK subarraySumEqualK = new SubarraySumEqualK();
        System.out.println(subarraySumEqualK.subarraySum(arr, 2));
    }

    public int subarraySum(int[] nums, int k) {

        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int total = 0;

        map.put(0, 1);

        for (int i = 0; i < nums.length; i++){

            total += nums[i];

            int rem = total - k;

            if (map.containsKey(rem)){
                res += map.get(rem);
            }

            map.put(total, map.getOrDefault(total, 0) + 1);

        }

        return res;
    }
}
