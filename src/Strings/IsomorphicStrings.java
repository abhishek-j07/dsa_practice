package Strings;

import java.util.HashMap;

public class IsomorphicStrings {

    public static void main(String[] args) {

        String s1 = "paper";
        String s2 = "title";

        IsomorphicStrings isom = new IsomorphicStrings();
        System.out.println(isom.isIsomorphic(s1, s2));
    }

    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        int n = s.length();

        int i = 0;

        while (i < n) {

            char firstChar = s.charAt(i);
            char secondChar = t.charAt(i);

            if((mapS.containsKey(firstChar) && mapS.get(firstChar) != secondChar) ||
            (mapT.containsKey(secondChar) && mapT.get(secondChar) != firstChar)) {
                return false;
            }

            mapS.put(firstChar, secondChar);
            mapT.put(secondChar, firstChar);

            i++;
        }

        return true;
    }
}
