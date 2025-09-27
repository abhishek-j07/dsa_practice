package Sorting;

import static Sorting.RecursiveBubbleSort.swap;

public class RecursiveInsertionSort {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 4, 3, 2, 1};

        insertionSort(arr,0,0);

        for(Integer i : arr){
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] arr,int s, int end){

        if(end == arr.length){
            return;
        }

        s = end;

        while(s > 0 && arr[s] < arr[s-1]){
            swap(arr,s,s-1);
            s--;
        }

        insertionSort(arr,s,end+1);
    }
}
