package Sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 4, 3, 2, 1};

        selectionSort(arr);

        for(Integer i : arr){
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] arr){

        for(int i = 0 ; i < arr.length ; i++){

            int minIdx = i;

            for(int j = i ; j < arr.length; j++){

                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

    }
}
