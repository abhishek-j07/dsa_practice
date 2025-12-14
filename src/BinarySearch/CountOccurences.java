package BinarySearch;

public class CountOccurences {

    public static void main(String[] args) {

        int[] arr = {5,7,7,8,8,10};

        System.out.println(count(arr,6,8));
    }

    public static int count(int nums[], int n, int target) {

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

        if(last == -1){
            return 0;
        }

        return (last-first)+1;
    }
}
