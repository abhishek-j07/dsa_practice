package Recursion;

public class reverseArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 55};
        reverse(arr,0,arr.length-1);

        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void reverse(int[] arr, int s, int e){

        if(s > e){
            return;
        }

        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        reverse(arr,s+1,e-1);
    }
}
