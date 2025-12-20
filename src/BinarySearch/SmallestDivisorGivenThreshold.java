package BinarySearch;

public class SmallestDivisorGivenThreshold {

    public static void main(String[] args) {

        int[] arr = {1,2,5,9};
        SmallestDivisorGivenThreshold s = new SmallestDivisorGivenThreshold();
        System.out.println(s.smallestDivisor(arr,6));
    }

    public int smallestDivisor(int[] nums, int threshold) {

        int l = 1;
        int h = max(nums);

        int ans = 0;

        while(l <= h){

            int mid = (l+h)/2;

            if(getTotal(nums,mid) > threshold){
                l = mid+1;
            }else {
                ans = mid;
                h = mid-1;
            }
        }

        return ans;
    }

    private int getTotal(int[] nums, int mid) {

        int total = 0;

        for(Integer i : nums){
            total += (int)Math.ceil(i*1.0/mid);
        }

        return total;
    }

    public int min(int[] arr){

        int min = Integer.MAX_VALUE;

        for(Integer i : arr){
            min = Math.min(min,i);
        }

        return min;
    }

    public int max(int[] arr){

        int max = Integer.MIN_VALUE;

        for(Integer i : arr){
            max = Math.max(max,i);
        }

        return max;
    }
}
