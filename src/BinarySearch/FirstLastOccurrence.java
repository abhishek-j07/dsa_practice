package BinarySearch;

public class FirstLastOccurrence {

    public static void main(String[] args) {

        int[] arr = {5,7,7,8,8,10};

        FirstLastOccurrence firstLastOccurrence = new FirstLastOccurrence();
        int[] ans = firstLastOccurrence.searchRange(arr,8);

        for(Integer i:ans){
            System.out.println(i);
        }
    }

    public int[] searchRange(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int first = -1;
        int last = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if(nums[mid] < target){
                low = mid + 1;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else {
                first = mid;
                high = mid - 1;
            }
        }

        low = 0;
        high = nums.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if(nums[mid] < target){
                low = mid + 1;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else {
                last = mid;
                low = mid + 1;
            }
        }

        return new int[]{first, last};
    }
}
