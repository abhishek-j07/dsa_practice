package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {

    public static void main(String[] args) {

        int[] arr = {0,3,4,7,10,9};

        System.out.println(aggressiveCows(arr,4));
    }

    public static int aggressiveCows(int []stalls, int k) {

        int ans = 0;
        Arrays.sort(stalls);
        int n = stalls.length;

        int l = 1;
        int h = stalls[n-1] - stalls[0];

        while(l <= h){

            int m = (l+h)/2;

            if(canPlace(stalls,m,k)){
                ans = m;
                l = m+1;
            }else{
                h = m-1;
            }
        }

        return ans;
    }

    private static boolean canPlace(int[] stalls, int gap, int cows) {

        int totalCow = 1;
        int last = stalls[0];

        for(int i = 1; i < stalls.length; i++){

            if(stalls[i] - last >= gap){
                totalCow++;
                last = stalls[i];
            }
        }

        return totalCow >= cows;
    }
}
