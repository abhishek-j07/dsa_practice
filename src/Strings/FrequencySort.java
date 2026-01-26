package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FrequencySort {

    public static void main(String[] args) {

        FrequencySort fs = new FrequencySort();
        String s = "bceeA";
        System.out.println(fs.frequencySort(s));
    }

    public class Pair{

        char c;
        int count;

        Pair(char c, int count){
            this.c = c;
            this.count = count;
        }

        @Override
        public String toString(){
            return c + "-" + count;
        }
    }

    public String frequencySort(String s) {


        StringBuilder sb = new StringBuilder();
        Pair[] pairs = new Pair[128];

        for(int i = 0; i < 128; i++){

            pairs[i] = new Pair('a', 0);

        }

        for(int i = 0 ; i < s.length(); i++){

            char c = s.charAt(i);
            int count = pairs[c - '0'].count;
            pairs[c - '0'] = new Pair(c, count + 1);
        }

        Arrays.sort(pairs, (a,b) -> {
            return b.count - a.count;
        });

        for(Pair p : pairs){
            if(p.count != 0) {
                while(p.count-- > 0) {
                    sb.append(p.c);
                }
            }
        }

        return sb.toString();
    }
}
