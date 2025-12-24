package BinarySearch;

public class KthMissingNumber {

    public static void main(String[] args) {

        int[] arr = {2,3,4,7,11};

        KthMissingNumber kthMissingNumber = new KthMissingNumber();
        System.out.println(kthMissingNumber.findKthPositive(arr, 5));
    }

    public int findKthPositive(int[] arr, int k) {

        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {

            int mid = l + (h - l) / 2;

            int missing = arr[mid] - (mid+1);

            if(missing < k){
                l = mid + 1;
            }else{
                h = mid - 1;
            }
        }

        return h+k+1;
    }
}
