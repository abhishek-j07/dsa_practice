package BasicHashing;

import java.util.Arrays;

public class MaxFrequency {

    public static void main(String[] args) {

        int[] arr = {1,2,4};
        MaxFrequency mf = new MaxFrequency();
        System.out.println(mf.maxFrequency(arr,5));
    }

    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);
        int maxFreq = 0;
        int left = 0;
        int right = 0;
        int total = 0;

        while(right < nums.length) {
            total += nums[right];

            while (nums[right] * (right - left + 1) > total + k) {

                total -= nums[right];
                left++;

            }

            maxFreq = Math.max(maxFreq, (right - left + 1));
            right++;
        }

        return maxFreq;
    }
}
