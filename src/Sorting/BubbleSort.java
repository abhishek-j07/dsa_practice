package Sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 4, 3, 2, 1};

        bubbleSort(arr);

        for(Integer i : arr){
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] arr){

        for(int i = arr.length - 1; i >= 0; i--){
            int swap = 0;
            for(int j = 0; j <= i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap = 1;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(swap == 0){
                break;
            }
        }
    }
}
