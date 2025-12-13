package BinarySearch;

public class FloorAndCeil {

    public static void main(String[] args) {

        int[] arr = {3,4,4,7,8,10};

        int[] ans = getFloorAndCeil(arr,6,8);

        for(Integer i:ans){
            System.out.println(i);
        }
    }

    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        // Write your code here.

        int floor = -1;
        int ceil = -1;

        int l = 0;
        int h = n-1;

        while (l <= h) {

            int mid = l + (h - l) / 2;

            if(a[mid] <= x) {
                floor = mid;
                l = mid + 1;
            }else{
                h = mid - 1;
            }
        }

        l = 0;
        h = n-1;

        while (l <= h) {

            int mid = l + (h - l) / 2;

            if(a[mid] >= x) {
                ceil = mid;
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }

        if(floor != -1){
            floor = a[floor];
        }

        if(ceil != -1){
            ceil = a[ceil];
        }

        return new int[]{floor, ceil};
    }
}
