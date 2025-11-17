package Arrays;

import java.util.HashMap;

public class MaxProductSubarray {

    public static void main(String[] args) {

        int[] arr = {2,3,-2,4};
        MaxProductSubarray maxProductSubarray = new MaxProductSubarray();
        System.out.println(maxProductSubarray.maxProduct(arr));
    }

    public int maxProduct(int[] nums) {

        int max = Integer.MIN_VALUE;
        int suffix = 1;
        int prefix = 1;

        for(int i = 0; i < nums.length; i++){

            if(prefix == 0){
                prefix = 1;
            }

            if(suffix == 0){
                suffix = 1;
            }

            prefix = prefix * nums[i];
            suffix = suffix * nums[nums.length-i-1];

            max = Math.max(max, suffix);
            max = Math.max(max, prefix);
        }

        return max;

    }
}
