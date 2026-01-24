package Strings;

public class RotateString {

    public static void main(String[] args) {

        String s1 = "a";
        String s2 = "aa";

        RotateString rs = new RotateString();
        System.out.println(rs.rotateString(s1, s2));
    }

    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()) return false;

        String text = goal + "#" + s + s;

        int[] lps = lps(text);

        for(Integer i : lps){
            if(i == goal.length()){
                return true;
            }
        }

        return false;
    }

    public int[] lps(String s){

        int n = s.length();

        int[] lps =  new int[n];
        lps[0] = 0;
        int len = 0;
        int i = 1;

        while(i < n){

            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len > 0) {
                    len = lps[len - 1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}
