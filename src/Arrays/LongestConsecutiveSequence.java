package Arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] arr = {100,4,200,1,3,2};

        LongestConsecutiveSequence longest = new LongestConsecutiveSequence();
        System.out.println(longest.longestConsecutive(arr));
    }

    public int longestConsecutive(int[] nums) {

        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i]-1)){

                int count = 1;
                int cur = nums[i];

                while(set.contains(cur+1)){
                    cur++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }

}
