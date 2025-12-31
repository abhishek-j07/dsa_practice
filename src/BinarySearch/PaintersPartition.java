package BinarySearch;

import java.util.ArrayList;

public class PaintersPartition {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(findLargestMinDistance(arr,2));
    }

    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        return splitArray(boards,k);
    }

    public static int splitArray(ArrayList<Integer> nums, int k) {

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

    private static boolean maxPossibleSum(ArrayList<Integer> nums, int sum, int subarray) {

        int totalSum = 0;
        int arrays = 1;

        for(int i = 0; i<nums.size(); i++){

            totalSum += nums.get(i);

            if(totalSum > sum){
                arrays++;
                totalSum = nums.get(i);
            }
        }

        return arrays <= subarray;

    }

    public static int findMax(ArrayList<Integer> arr){

        int max = Integer.MIN_VALUE;

        for(Integer i : arr){
            max = Math.max(max,i);
        }

        return max;
    }

    public static int getTotal(ArrayList<Integer> arr){

        int total = 0;

        for(Integer i : arr){
            total += i;
        }

        return total;
    }
}
