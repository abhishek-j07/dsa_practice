package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneNumberCombination {

    public static void main(String[] args) {

    }

    public List<String> letterCombinations(String digits) {


        List<String> res = new ArrayList<>();
        String[] dict = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs",
                "tuv", "wxyz"};

        return findCombination(0, dict, digits);

    }

    private List<String> findCombination(int i, String[] dict,
                                         String digits) {

        if (i == digits.length()) {

            List<String> l = new ArrayList<>();
            l.add("");
            return l;
        }

        List<String> res = new ArrayList<>();

        List<String> rest = findCombination(i + 1, dict, digits);
        char c = digits.charAt(i);
        String ch = dict[c-'0'];

        for(String str : rest){
            for(int idx = 0 ; idx < ch.length() ; idx++){

                char temp = ch.charAt(idx);
                res.add(temp + str);
            }
        }

        return res;
    }

}
