package Sorting;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 4, 3, 2, 1};

        insertionSort(arr);

        for(Integer i : arr){
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] arr){

        for(int i = 0 ; i < arr.length ; i++){

            int j = i;

            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }
}
