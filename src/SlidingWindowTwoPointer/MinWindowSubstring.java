package SlidingWindowTwoPointer;

import java.util.Arrays;
import java.util.HashMap;

public class MinWindowSubstring {

    public static void main(String[] args) {

    }

    public String minWindow(String s, String t) {

        int len = Integer.MAX_VALUE;
        int si = -1;
        int slen = s.length();
        int tlen = t.length();
        int left = 0;
        int right = 0;
        int[] map = new int[256];
        Arrays.fill(map, 0);
        int c = 0;

        for (int i = 0; i < tlen; i++) {
            map[t.charAt(i)]++;
        }

        while (right < slen) {

            if(map[s.charAt(right)] > 0) {
                c++;
            }

            map[s.charAt(right)]--;

            while(c == tlen){

                if(len > right - left + 1) {
                    len = right - left + 1;
                    si = left;
                }

                map[s.charAt(left)]++;
                if(map[s.charAt(left)] > 0) {
                    c--;
                }
                left++;
            }

            right++;
        }

        return si == -1 ? "" : s.substring(si, si+len);
    }
}
