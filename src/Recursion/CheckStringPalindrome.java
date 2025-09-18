package Recursion;

public class CheckStringPalindrome {

    public static void main(String[] args) {

        CheckStringPalindrome c = new CheckStringPalindrome();
        System.out.println(c.isPalindrome("aaa"));
    }

    public boolean isPalindrome(String s) {

        String cleanString = removeAlphanumericChars(toLowerCase(s));
        return checkPalindrome(cleanString, 0 , cleanString.length() - 1);
    }

    public boolean checkPalindrome(String str, int s, int e){

        if(s > e){
            return true;
        }

        if(str.charAt(s) != str.charAt(e)){
            return false;
        }

        return checkPalindrome(str,s+1,e-1);
    }

    public String toLowerCase(String s){
        return s.toLowerCase();
    }

    public String removeAlphanumericChars(String s){
        return s.replaceAll("[^A-Za-z0-9]","");
    }
}

