package Arrays;

import java.util.ArrayList;

public class CountInversions {

    public static void main(String[] args) {

        int[] arr = {5,3,2,1,4};
        System.out.println(numberOfInversions(arr,5));
    }

    public static int mergeSort(int[] arr, int low, int high) {

        int c = 0;

        if(low == high){
            return c;
        }

        int mid = (low + high)/2;
        c += mergeSort(arr,low, mid);
        c += mergeSort(arr,mid+1 ,high);
        c += merge(arr,low,mid,high);

        return c;

    }

    public static int merge(int[] arr, int low, int mid, int high) {

        int c = 0;
        int l = low;
        int r = mid + 1;
        ArrayList<Integer> merged = new ArrayList<>();

        while(l <= mid && r <= high){

            if(arr[l] <= arr[r]){
                merged.add(arr[l]);
                l++;
            }else {
                c += (mid - l + 1);
                merged.add(arr[r]);
                r++;
            };
        }

        while(l <= mid){
            merged.add(arr[l]);
            l++;
        }

        while(r <= high){
            merged.add(arr[r]);
            r++;
        }

        for(int j = low; j <= high; j++){
            arr[j] = merged.get(j-low);
        }

        return c;
    }

    public static int numberOfInversions(int []a, int n) {

        int ans = 0;

        ans = mergeSort(a,0,n-1);

        return ans;
    }
}
