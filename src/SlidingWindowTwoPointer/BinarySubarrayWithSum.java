package SlidingWindowTwoPointer;

public class BinarySubarrayWithSum {

    public static void main(String[] args) {


    }

    public int numSubarraysWithSum(int[] nums, int goal) {

        int sum1 = findSubarrays(nums, goal);
        int sum2 = findSubarrays(nums, goal-1);

        return sum1 - sum2;
    }

    public int findSubarrays(int[] nums, int goal) {

        int c = 0;
        int n = nums.length;
        int l = 0;
        int r = 0;
        int sum = 0;

        if(goal < 0){
            return 0;
        }

        while(r < n){

            sum += nums[r];

            while(sum > goal){

                sum -= nums[l];
                l++;
            }

            c += r-l+1;
            r++;
        }

        return c;
    }
}
