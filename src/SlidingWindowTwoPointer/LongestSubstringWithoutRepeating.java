package SlidingWindowTwoPointer;

import java.util.HashMap;

public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {

        int max = 0;

        int start = 0;
        int end = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        while(end < n){

            if(map.containsKey(s.charAt(end))){
                start = Math.max(map.get(s.charAt(end))+1,start);
            }

            map.put(s.charAt(end),end);
            max = Math.max(max,end-start+1);
            end++;
        }

        return max;

    }
}
