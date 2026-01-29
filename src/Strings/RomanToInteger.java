package Strings;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {

        String s = "MCMXCIV";
        RomanToInteger r = new RomanToInteger();
        System.out.println(r.romanToInt(s));
    }

    public int romanToInt(String s) {

        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int i = 0;

        while(i < s.length()-1){

            char c1 = s.charAt(i);
            char c2 = s.charAt(i+1);

            int first = map.get(c1);
            int second = map.get(c2);

            if(first >= second){
                ans += first;
                i++;
            }else{
                ans += (second - first);
                i = i + 2;
            }
        }

        while(i < s.length()){
            char c1 = s.charAt(i);
            ans += map.get(c1);
            i++;
        }

        return ans;
    }
}
