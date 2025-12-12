package BinarySearch;

public class SearchInsert {

    public static void main(String[] args) {

        int[] arr = {1,3,5,6};
        SearchInsert searchInsert = new SearchInsert();
        System.out.println(searchInsert.searchInsert(arr,2));
    }

    public int searchInsert(int[] nums, int target) {

        int l = 0;
        int h = nums.length-1;
        int ans = h+1;

        while(l <= h){

            int mid = (l+h)/2;

            if(nums[mid] >= target){
                ans = mid;
                h = mid - 1;
            }else {
                l = mid + 1;
            }
        }

        return ans;
    }
}
