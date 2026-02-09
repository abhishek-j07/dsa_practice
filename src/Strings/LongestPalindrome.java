package Strings;

public class LongestPalindrome {

    public static void main(String[] args) {

        String s = "babad";
        LongestPalindrome lp = new LongestPalindrome();
        System.out.println(lp.longestPalindrome(s));
    }

    public String longestPalindrome(String str) {

        String s = updatedString(str);
        int[] lps =  new int[s.length()];
        int c = 0;
        int r = 0;


        for(int i = 1; i < s.length() - 1; i++) {

            int mirror = c-(i-c);

            if(i < r){
                lps[i] = Math.min(lps[mirror], r-i);
            }
            while(s.charAt(i+lps[i]+1) == s.charAt(i-lps[i]-1)) {
                lps[i]++;
            }

            if(i + lps[i] > r){
                c = i;
                r = i + lps[i];
            }
        }

        int maxIdx = 0;
        int maxLen = 0;

        for(int i = 1; i < lps.length - 1; i++) {
            if(lps[i] > maxLen) {
                maxIdx = i;
                maxLen = lps[i];
            }
        }

        int firstIdx = maxIdx - maxLen + 1;
        int actualIdx = (firstIdx - 2)/2;

        return str.substring(actualIdx, actualIdx+maxLen);

    }

    public String updatedString(String s) {

        StringBuilder sb = new StringBuilder();
        sb.append("@");

        for(int i = 0; i < s.length(); i++) {
            sb.append("#");
            sb.append(s.charAt(i));
        }

        sb.append("#");
        sb.append("$");

        return sb.toString();

    }
}
