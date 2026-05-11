package SlidingWindowTwoPointer;

public class MaxConsecutiveOnesIII {

    public static void main(String[] args) {

    }

    public int longestOnes(int[] nums, int k) {

        int len = 0;

        int left = 0;
        int right = 0;
        int n = nums.length;
        int zeros = 0;

        for(right = 0 ; right < n ; right++){

            if(nums[right] == 0){
                zeros++;
            }

            while(zeros > k){

                if(nums[left] == 0){
                    zeros--;
                }

                left++;
            }

            len =  Math.max(len, right - left + 1);
        }

        return len;
    }
}
