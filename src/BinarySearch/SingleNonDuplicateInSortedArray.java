package BinarySearch;

public class SingleNonDuplicateInSortedArray {

    public static void main(String[] args) {

        int[] arr = {1,1,2};

        SingleNonDuplicateInSortedArray sn = new SingleNonDuplicateInSortedArray();
        int ans = sn.singleNonDuplicate(arr);
        System.out.println(ans);
    }

    public int singleNonDuplicate(int[] nums) {

        int l = 1;
        int n = nums.length;
        int h = n-2;

        if(nums.length == 1){
            return nums[0];
        }

        if(nums[0] != nums[1]){
            return nums[0];
        }

        if(nums[n-2] != nums[n-1]){
            return nums[n-1];
        }

        while(l <= h){

            int m = l + (h - l)/2;

            if(nums[m] != nums[m+1] && nums[m] != nums[m-1]){
                return nums[m];
            }

            if ((m % 2 == 1 && nums[m] == nums[m - 1]) ||
                    (m % 2 == 0 && nums[m] == nums[m + 1])) {
                // Move to the right half
                l = m + 1;
            }
            // If mid is in the right half (pairing broken earlier)
            else {
                // Move to the left half
                h = m - 1;
            }
        }

        return -1;
    }
}
