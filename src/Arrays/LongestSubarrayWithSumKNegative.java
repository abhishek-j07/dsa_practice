package Arrays;

import java.util.HashMap;

public class LongestSubarrayWithSumKNegative {

    public static void main(String[] args) {

        int[] arr = {-1,0,1,1,-1,-1,0};

        System.out.println(longestSubArray(arr,0));
    }

    public static int longestSubArray(int[] arr, int k){

        int total = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){

            total += arr[i];

            if(total == k){

                max = Math.max(max,i+1);
            }

            if(map.containsKey(total-k)){
                int start = map.get(total-k);
                max = Math.max(max, (i - start));
            }

            if(!map.containsKey(total)){
                map.put(total, i);
            }
        }

        return max;
    }
}
