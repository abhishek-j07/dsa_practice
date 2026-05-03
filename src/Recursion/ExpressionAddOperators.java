package Recursion;

import java.util.ArrayList;
import java.util.List;

public class ExpressionAddOperators {

    public static void main(String[] args) {

    }

    public List<String> addOperators(String num, int target) {


        List<String> res = new ArrayList<>();

        solve(num,target,0,res,"",0,0);

        return res;
    }

    public void solve(String num, int target, int index,
                      List<String> res, String curr, long prev, long resTillNow){

        if(index==num.length()){
            if(resTillNow ==  target){
                res.add(curr);
            }
            return;
        }

        String st = "";
        long currRes = 0;

        for(int i=index;i<num.length();i++){

            if(i > index && num.charAt(index) == '0'){
                break;
            }

            st += num.charAt(i);
            currRes = currRes*10 + (num.charAt(i)-'0');

            if(index == 0){
                solve(num,target, i+1, res, st, currRes, currRes);
            }else{
                solve(num,target, i+1, res, curr + "+" + st, currRes, resTillNow + currRes);
                solve(num,target, i+1, res, curr + "-" + st, -currRes, resTillNow - currRes);
                solve(num,target, i+1, res, curr + "*" + st, prev*currRes, (resTillNow - prev)+ prev*currRes);
            }
        }
    }

}
