package BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(arr, 40));
    }

    public int search(int[] nums, int target) {

        return binarySearch(nums, target, 0, nums.length - 1);

    }

    public int binarySearch(int[] nums, int target, int start, int end) {

        int mid = (start + end) / 2;

        if(start > end){
            return -1;
        }

        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] > target){
            return binarySearch(nums, target, start, mid - 1);
        }else {
            return binarySearch(nums, target, mid + 1, end);
        }
    }
}
