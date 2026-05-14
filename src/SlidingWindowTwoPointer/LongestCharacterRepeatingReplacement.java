package SlidingWindowTwoPointer;

import java.util.HashMap;

public class LongestCharacterRepeatingReplacement {

    public static void main(String[] args) {

    }

    public int characterReplacement(String s, int k) {

        int left = 0;
        int right = 0;
        int n = s.length();
        int len = 0;
        int[] hash = new int[26];
        int maxFreq = 0;

        while(right < n){

            hash[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq, hash[s.charAt(right)-'A']);

            while((right - left + 1) - maxFreq > k){

                hash[s.charAt(left)-'A']--;
                left++;
            }

            len = Math.max(len, right - left + 1);
            right++;
        }

        return len;
    }
}
