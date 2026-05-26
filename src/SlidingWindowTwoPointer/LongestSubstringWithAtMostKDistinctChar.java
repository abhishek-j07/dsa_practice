package SlidingWindowTwoPointer;

import java.util.HashMap;

public class LongestSubstringWithAtMostKDistinctChar {

    public static void main(String[] args) {

    }

    public static int kDistinctChars(int k, String str) {
        // Write your code here

        if (k == 0 || str.length() == 0) return 0;
        int len = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        int n = str.length();
        int i = 0;

        for(int j = 0 ; j < n ; j++){

            char c = str.charAt(j);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            // Shrink window if more than k distinct chars
            while (freq.size() > k) {
                char leftChar = str.charAt(i);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                i++;
            }

            len = Math.max(len, j - i + 1);

        }

        return len;
    }
}
