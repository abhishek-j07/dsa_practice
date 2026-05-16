package SlidingWindowTwoPointer;

public class CountNiceSubarrays {

    public static void main(String[] args) {

    }

    public int numberOfSubarrays(int[] nums, int k) {

        for(int i = 0; i < nums.length; i++){

            if(nums[i] % 2 == 0){
                nums[i] = 0;
            }else {
                nums[i] = 1;
            }
        }

        int sum1 = findSubarrays(nums, k);
        int sum2 = findSubarrays(nums, k-1);

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
