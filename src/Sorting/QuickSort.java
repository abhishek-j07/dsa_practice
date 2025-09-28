package Sorting;

import static Sorting.RecursiveBubbleSort.swap;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 4, 3, 2, 1};

        quickSort(arr,0,arr.length-1);

        for(Integer i : arr){
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] arr, int start, int end) {

        if(start >= end){
            return;
        }

        int pivot = findPivot(arr,start,end);
        quickSort(arr,start,pivot-1);
        quickSort(arr,pivot+1,end);
    }

    public static int findPivot(int[] arr, int start, int end) {

        int pivot = arr[start];
        int i = start;
        int j = end;

        while(i < j) {

            while (arr[i] <= pivot && i < end) {
                i++;
            }
            while (arr[j] > pivot && j > start) {
                j--;
            }

            if(i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr,start,j);
        return j;
    }
}
