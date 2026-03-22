package Recursion;

import java.util.ArrayList;
import java.util.List;

public class StringWithoutConsecutive1s {

    public static void main(String[] args) {

    }

    public static List< String > generateString(int N) {

        List<String> result = new ArrayList<>();

        generate(N, "", result);

        return result;
    }

    public static void generate(int n, String str, List< String > result) {

        if(str.length() == n){
            result.add(str);
            return;
        }

        generate(n, str+"0", result);

        if(str.isEmpty() || str.charAt(str.length()-1) != '1'){
            generate(n, str+"1", result);
        }
    }
}
