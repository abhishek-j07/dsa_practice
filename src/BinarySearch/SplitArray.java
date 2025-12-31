package BinarySearch;

import java.util.ArrayList;

public class SplitArray {

    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5};
        SplitArray splitArray = new SplitArray();
        System.out.println(splitArray.splitArray(arr,2));
    }

    public int splitArray(int[] nums, int k) {

        int ans = 0;

        int l = findMax(nums);
        int h = getTotal(nums);

        while(l <= h){

            int m =  (l+h)/2;

            if(maxPossibleSum(nums,m,k)){
                ans = m;
                h = m-1;
            }else{
                l = m+1;
            }
        }

        return ans;

    }

    private boolean maxPossibleSum(int[] nums, int sum, int subarray) {

        int totalSum = 0;
        int arrays = 1;

        for(int i = 0; i<nums.length; i++){

            totalSum += nums[i];

            if(totalSum > sum){
                arrays++;
                totalSum = nums[i];
            }
        }

        return arrays <= subarray;

    }

    public int findMax(int[] arr){

        int max = Integer.MIN_VALUE;

        for(Integer i : arr){
            max = Math.max(max,i);
        }

        return max;
    }

    public int getTotal(int[] arr){

        int total = 0;

        for(Integer i : arr){
            total += i;
        }

        return total;
    }
}
