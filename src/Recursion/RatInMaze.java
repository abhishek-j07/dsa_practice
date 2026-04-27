package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class RatInMaze {

    public static void main(String[] args) {

    }

    public static ArrayList<String> findSum(int[][] arr, int n) {


        ArrayList<String> res = new ArrayList<>();
        StringBuilder curr = new StringBuilder();

        solve(arr,n,res,curr,0,0);

        Collections.sort(res);

        return res;

    }

    public static void solve(int[][] arr,int n,ArrayList<String> res,StringBuilder curr,int ri,int ci){

        if(ri < 0 || ci < 0 || ri >= n || ci >= n || arr[ri][ci] == 0){
            return;
        }

        if(ri == n-1 && ci == n-1){
            res.add(curr.toString());
        }

        arr[ri][ci] = 0;

        if(ri-1 >= 0 && arr[ri-1][ci] == 1){
            curr.append("U");
            solve(arr,n,res,curr,ri-1,ci);
            curr.deleteCharAt(curr.length()-1);
        }

        if(ri+1 < n && arr[ri+1][ci] == 1){
            curr.append("D");
            solve(arr,n,res,curr,ri+1,ci);
            curr.deleteCharAt(curr.length()-1);
        }

        if(ci-1 >= 0 && arr[ri][ci-1] == 1){
            curr.append("L");
            solve(arr,n,res,curr,ri,ci-1);
            curr.deleteCharAt(curr.length()-1);
        }

        if(ci+1 < n && arr[ri][ci+1] == 1){
            curr.append("R");
            solve(arr,n,res,curr,ri,ci+1);
            curr.deleteCharAt(curr.length()-1);
        }

        arr[ri][ci] = 1;
    }
}
