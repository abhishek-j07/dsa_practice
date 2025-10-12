package Arrays;

public class PrintMaxSubarray {

    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        PrintMaxSubarray maxSubarray = new PrintMaxSubarray();
        maxSubarray.maxSubArray(arr);
    }

    public void maxSubArray(int[] nums) {

        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = -1;
        int si = -1;
        int end = -1;

        for(int i = 0 ; i < n ; i++){

            if(sum == 0){
                start = i;
            }

            sum += nums[i];

            if(sum > max){
                max = sum;
                si = start;
                end = i;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        for(int i = si ; i <= end; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
