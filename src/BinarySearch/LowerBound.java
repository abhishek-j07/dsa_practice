package BinarySearch;

public class LowerBound {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 5};
        System.out.println(lowerBound(arr,arr.length,0));
    }

    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        return binarySearch(arr, 0, n - 1, x);

    }

    public static int binarySearch(int []arr, int l, int h, int num) {

        int ans = arr.length;

        while(l <= h){

            int mid = l + (h - l)/2;

            if(arr[mid] >= num){
                ans = mid;
                h = mid - 1;
            }else {
                l = mid + 1;
            }
        }

        return ans;
    }
}
