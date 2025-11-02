package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LongestSubarrayWithSumZero {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,-1,2,-2));
        System.out.println(longestSubsetWithZeroSum(arr));
    }

    public static int longestSubsetWithZeroSum(ArrayList<Integer> arr) {

        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int total = 0;

        for(int i = 0; i < arr.size(); i++){

            total += arr.get(i);

            if(total == 0){
                ans = i+1;
            }else {
                if (map.containsKey(total)) {
                    ans = Math.max(ans, (i - map.get(total)));
                }else {
                    map.put(total, i);
                }
            }
        }

        return ans;
    }
}
