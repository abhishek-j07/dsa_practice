package Arrays;

public class LongestSubarrayWithSumK {

    public static void main(String[] args) {

        int[] arr = {1,2,1,3};
        System.out.println(longestSubarray(arr,2));
    }

    public static int longestSubarray(int[] arr, long k) {

        int n = arr.length;
        int left = 0;
        int right = 0;
        int max = 0;
        long total = arr[0];

        while(right < n){

            while(left <= right && total > k){
                total -= arr[left];
                left++;
            }

            if(total == k) {
                max = Math.max(max, right - left + 1);
            }

            right++;

            if(right < n){
                total += arr[right];
            }
        }

        return max;
    }

}
