package Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        RotateArray rotateArray = new RotateArray();

        rotateArray.optimizedRotate(arr,1);

        for(Integer i : arr){
            System.out.print(i+" ");
        }
    }

    public void optimizedRotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        if(k == n){
            return;
        }

        reverse(nums,0,n-1);

        reverse(nums,0,k-1);
        reverse(nums,k,n-1);


    }

    public void reverse(int[] nums, int start, int end) {

        while(start < end){

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }

    }

    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        if(k == n){
            return;
        }

        while(k-- > 0){

            int lastElement = nums[n-1];

            for(int i = n-1 ; i > 0 ; i--){
                nums[i] = nums[i-1];
            }

            nums[0] = lastElement;
        }
    }
}
