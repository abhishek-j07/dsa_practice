package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public static void main(String[] args) {

    }

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        generate(result,0,0,"",n);
        return result;
    }

    public void generate(List<String> result,int close,int open,String str, int n){

        if(str.length() == 2*n){
            result.add(str);
            return;
        }

        if(open < n){
            generate(result,close,open+1,str + "(",n);
        }

        if(close < open){
            generate(result,close+1,open,str + ")",n);
        }
    }
}
