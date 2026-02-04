package Strings;

import java.util.HashMap;

public class SubstringWithKDistinctChars {

    public static void main(String[] args) {


        String s = "abcbaa";
        System.out.println(substringWithKDistinct(s, 3));
    }

    public static int substringWithKDistinct(String s, int k) {

        int ans = 0;

        HashMap<Character, Integer> bigMap = new HashMap<>();
        HashMap<Character, Integer> smallMap = new HashMap<>();

        int j = -1;
        int is = -1;
        int ib = -1;

        while(true){

            boolean f1 = false;
            boolean f2 = false;
            boolean f3 = false;

            while(ib < s.length() - 1){

                f1 = true;

                ib++;
                char c = s.charAt(ib);
                bigMap.put(c, bigMap.getOrDefault(c, 0) + 1);

                if(bigMap.size() > k){
                    removeFromMap(bigMap,c);
                    ib--;
                    break;
                }
            }

            while(is < ib){

                f2 = true;

                is++;
                char c = s.charAt(is);

                smallMap.put(c, smallMap.getOrDefault(c, 0) + 1);

                if(smallMap.size() > k-1){
                    removeFromMap(smallMap,c);
                    is--;
                    break;
                }
            }

            while(j < is){

                f3 = true;

                if(bigMap.size() == k &&  smallMap.size() == k-1){
                    ans += (ib-is);
                }

                j++;
                char c = s.charAt(j);

                removeFromMap(bigMap,c);
                removeFromMap(smallMap,c);

                if(smallMap.size() < k-1 ||  bigMap.size() < k){
                    break;
                }

            }

            if(f1 == false && f2 == false && f3 == false){
                break;
            }

        }

        return ans;
    }

    public static void removeFromMap(HashMap<Character,Integer> map, Character c){

        if(map.get(c) == 1){
            map.remove(c);
        }else {
            map.put(c, map.get(c) - 1);
        }
    }
}
