package Recursion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class WordBreak {

    public static void main(String[] args) {

    }

    public static Boolean wordBreak(String[] arr, int n, String target) {

        HashSet<String> set = new HashSet<>(Arrays.asList(arr));
        return solve(set,n,target,0,0);
    }

    private static boolean solve(HashSet<String> arr, int n, String target, int s, int e) {

        if(e == target.length()-1){
            if(arr.contains(target.substring(s,e+1))){
                return true;
            }

            return false;
        }

        if(arr.contains(target.substring(s,e+1))){
            if(solve(arr,n,target,e+1,e+1)){
                return true;
            }
        }

        return solve(arr,n,target,s,e+1);

    }
}
