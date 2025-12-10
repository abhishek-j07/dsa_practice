package BinarySearch;

public class UpperBound {

    public static void main(String[] args) {

        int[] arr = {1,4,7,8,10};

        System.out.println(upperBound(arr,7,arr.length-1));
    }

    public static int upperBound(int []arr, int x, int n){
        // Write your code here.

        return binarySearch(arr,0,n,x);
    }

    public static int binarySearch(int []arr, int start, int end, int target){

        int ans = end+1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] <= target){
                start = mid + 1;
            }else {
                ans = mid;
                end = mid-1;
            }
        }

        return ans;
    }
}
