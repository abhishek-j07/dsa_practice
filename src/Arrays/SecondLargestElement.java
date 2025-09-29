package Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 4, 3, 2, 1, 0 , 12, 34, 34};

        System.out.println(findSecondLargest(arr));
    }

    public static int findSecondLargest(int[] arr) {

        int i = 0;
        int n = arr.length;
        int max = arr[0];
        int secondLargest = arr[0];

        while (i < n){

            if(arr[i] > max){
                secondLargest = max;
                max = arr[i];
            }else {
                if (arr[i] > secondLargest) {
                    secondLargest = arr[i];
                }
            }
            i++;
        }

        return secondLargest;
    }
}
