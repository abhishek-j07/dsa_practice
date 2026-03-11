package Recursion;

public class StringToIntegerAtoi {

    public static void main(String[] args) {

    }

    public int myAtoi(String s) {

        long ans = 0;
        int i = 0;

        while (i < s.length() && s.charAt(i) == ' ') i++;

        int sign = 1;
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        return (int)atoi(s, i, sign, ans);
    }

    public long atoi(String s, int idx, int sign, long ans) {

        if(idx >= s.length() || !Character.isDigit(s.charAt(idx))){

            return (int)(sign*ans);
        }

        ans = ans * 10 + (s.charAt(idx) - '0');

        if(sign * ans >= Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }

        if(sign * ans <= Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        return atoi(s, idx + 1, sign, ans);

    }
}
