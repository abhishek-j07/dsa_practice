package Sorting;

public class RecursiveBubbleSort {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 4, 3, 2, 1};

        bubbleSort(arr,0, arr.length-1);

        for(Integer i : arr){
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] arr, int low, int high){

        if(low >= high){
            return;
        }

        while(low < high && arr[low] > arr[high]){
            swap(arr,low,high);
            low++;
        }

        bubbleSort(arr,low,high-1);
    }

    public static void swap(int[] arr, int low, int high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}
