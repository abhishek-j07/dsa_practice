package Sorting;

import java.util.ArrayList;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 4, 3, 2, 1};

        mergeSort(arr, 0 , arr.length-1);

        for(Integer i : arr){
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {

        if(low == high){
            return;
        }

        int mid = (low + high)/2;
        mergeSort(arr,low, mid);
        mergeSort(arr,mid+1 ,high);
        merge(arr,low,mid,high);
;
    }

    public static void merge(int[] arr, int low, int mid, int high) {

        int l = low;
        int r = mid + 1;
        ArrayList<Integer> merged = new ArrayList<>();

        while(l <= mid && r <= high){

            if(arr[l] <= arr[r]){
                 merged.add(arr[l]);
                l++;
            }else {
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
    }
}
