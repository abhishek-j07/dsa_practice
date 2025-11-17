package Arrays;

import java.util.ArrayList;

public class ReversePairs {

    public static void main(String[] args) {

        int[] arr = {2,4,3,5,1};
        ReversePairs r = new ReversePairs();
        System.out.println(r.reversePairs(arr));
    }

    public int reversePairs(int[] nums) {

        return mergeSort(nums,0, nums.length-1);
    }

    public int mergeSort(int[] arr, int low, int high) {

        int c = 0;

        if(low == high){
            return c;
        }

        int mid = (low + high)/2;
        c += mergeSort(arr,low, mid);
        c += mergeSort(arr,mid+1 ,high);
        c += countPairs(arr,low,mid,high);
        merge(arr,low,mid,high);

        return c;

    }

    private int countPairs(int[] arr, int low, int mid, int high) {

        int c = 0;
        int r = mid+1;

        for(int i = low; i <= mid; i++){

            while(r <= high && arr[i] > 2*arr[r]){
                r++;
            }

            c += (r-(mid+1));
        }

        return c;
    }

    public void merge(int[] arr, int low, int mid, int high) {

        int c = 0;
        int l = low;
        int r = mid + 1;
        ArrayList<Integer> merged = new ArrayList<>();

        while(l <= mid && r <= high){

            if(arr[l] <= arr[r]){
                merged.add(arr[l]);
                l++;
            }else {
                if(arr[l] > 2*arr[r]){
                    c++;
                }
                merged.add(arr[r]);
                r++;
            }
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

    }
}
