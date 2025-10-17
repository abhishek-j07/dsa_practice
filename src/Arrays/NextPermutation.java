package Arrays;

public class NextPermutation {

    public static void main(String[] args) {

        int[] arr = {1,3,2};
        NextPermutation nextPermutation = new NextPermutation();
        nextPermutation.nextPermutation(arr);
        for(Integer i : arr){
            System.out.print(i+" ");
        }
    }

    public void nextPermutation(int[] nums) {

         int idx = -1;
         int n = nums.length;

         for(int i = n-2 ; i >= 0 ; i--){
             if(nums[i] < nums[i+1]){
                 idx = i;
                 break;
             }
         }

         if(idx == -1){
             reverse(nums,0,n-1);
             return;
         }

         for(int i = n-1 ; i >= idx+1 ; i--){
             if(nums[i] > nums[idx]){
                 int temp = nums[idx];
                 nums[idx] = nums[i];
                 nums[i] = temp;
                 break;
             }
         }

         reverse(nums,idx+1,n-1);
    }

    public void reverse(int[] nums, int start, int end){

        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
