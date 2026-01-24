package Strings;

import java.util.HashMap;

public class CheckIfAnagram {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "cba";

        CheckIfAnagram check = new CheckIfAnagram();
        System.out.println(check.isAnagram(s1, s2));
    }

    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); i++) {
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        }

        return map1.equals(map2);
    }
}
