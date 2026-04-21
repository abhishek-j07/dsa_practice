package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public static void main(String[] args) {

    }

    public static List<List<String>> partition(String s) {
        // Write your code here.

        List<List<String>> res = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        int i = 0;

        palindromePartitions(res,curr,i,s);

        return res;
    }

    public static void palindromePartitions(List<List<String>> res,List<String> curr,
                                            int i,String s){

        if(i == s.length()){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int idx = i ; idx < s.length() ;idx++){

            if(isPalindrome(s,i,idx)){
                curr.add(s.substring(i,idx+1));
                palindromePartitions(res,curr,idx+1,s);
                curr.remove(curr.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String s, int left,int right){

        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
