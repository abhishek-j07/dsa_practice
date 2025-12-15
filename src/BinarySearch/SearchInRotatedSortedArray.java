package BinarySearch;

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {

        int[] arr = {5,1,3};

        SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();

        System.out.println(obj.search(arr,3));
    }

    public int search(int[] nums, int target) {


        int l = 0;
        int h = nums.length-1;

        while(l <= h){

            int m =  (l+h)/2;

            if(nums[m] == target){
                return m;
            }else if(nums[l] <= nums[m]){

                //left half is sorted

                if(nums[l] <= target && target <= nums[m]){
                    h = m-1;
                }else{
                    l = m+1;
                }
            }else{

                if(nums[m] <= target && target <= nums[h]){
                    l = m+1;
                }else{
                    h = m-1;
                }
            }

        }

        return -1;
    }
}
