package SlidingWindowTwoPointer;

public class MinWindowSubsequence {

    public static void main(String[] args) {

    }

    public static String minWindow(String s, String t) {

        int i = 0;
        int j = 0;
        int k = 0;
        int slen = s.length();
        int tlen = t.length();
        int len = Integer.MAX_VALUE;
        String res = "";


        while (j < slen && k < tlen) {

            if (s.charAt(j) == t.charAt(k)) {
                k++;
            }

            if(k == tlen){

                k = tlen-1;
                i = j;
                while(i >= 0 && k >= 0){
                    if(s.charAt(i) == t.charAt(k)){
                        k--;
                    }
                    i--;
                }

                i++;
                if(len > j-i+1){
                    len = j-i+1;
                    res = s.substring(i, i+len);
                }

                k = 0;
                j = i+1;
            }
            j++;
        }

        return res;
    }
}
