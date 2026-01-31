package Strings;

public class StringToInteger {

    public static void main(String[] args) {

        StringToInteger s=new StringToInteger();
        System.out.println(s.myAtoi("-432442334354343444323"));
    }

    public int myAtoi(String s) {

        long ans = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        int i = 0;
        int n = s.length();
        int isNegative = 1;

        while(i < n && s.charAt(i) == ' '){
            i++;
        }

        if (i == s.length()) return 0;

        if(s.charAt(i) == '-'){
            isNegative = -1;
            i++;
        }else if (s.charAt(i) == '+') {
            i++;
        }

        while (i < n) {

            char c = s.charAt(i);

            if(Character.isDigit(c)){
                ans = ans * 10 + (c - '0');

                if(ans * isNegative > max){
                    return max;
                }

                if(ans * isNegative < min){
                    return min;
                }

            }else{
                break;
            }

            i++;
        }

        return (int)ans*isNegative;
    }
}
