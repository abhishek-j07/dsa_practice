package Recursion;

import java.util.ArrayList;

public class PowerSet {

    public static void main(String[] args) {

    }

    public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        ArrayList<Integer> temp = new ArrayList<>();

        power(res,0,temp,arr);

        return res;
    }

    public static void power(ArrayList<ArrayList<Integer>> res,int i, ArrayList<Integer> curr,
                             ArrayList<Integer> arr) {

        if(i == arr.size()){
            res.add(new ArrayList<>(curr));
            return;
        }

        power(res,i+1,curr,arr);

        curr.add(arr.get(i));

        power(res,i+1,curr,arr);

        curr.remove(curr.size()-1);
    }
}
