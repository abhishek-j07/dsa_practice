package BinarySearch;

public class MinInRotatedSortedArray {

    public static void main(String[] args) {

        int[] arr = {3,1,2};

        MinInRotatedSortedArray obj = new MinInRotatedSortedArray();
        System.out.println(obj.findMin(arr));
    }

    public int findMin(int[] nums) {

        int ans = Integer.MAX_VALUE;

        int l = 0;
        int h =  nums.length - 1;

        while (l <= h){

            int m = l + (h - l)/2;

            ans = Math.min(ans, nums[m]);

            if(nums[l] <= nums[m]){

                if(nums[h] < nums[l]){
                    l = m + 1;
                }else{
                    h = m - 1;
                }
            }else{

                l++;
            }
        }

        return ans;
    }
}
