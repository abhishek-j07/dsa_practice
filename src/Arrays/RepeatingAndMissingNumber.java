package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RepeatingAndMissingNumber {

    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(3);
        arr1.add(1);
        arr1.add(2);
        arr1.add(5);
        arr1.add(3);

        for(int n: missingAndRepeating(arr1,5)){
            System.out.println(n);
        }
    }

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {

        int totalXor = 0;
        int[] ans = new int[2];

        for (int i = 0; i < n; i++) {

            totalXor ^= arr.get(i);
            totalXor ^= (i+1);
        }

        int zeros = 0;
        int ones = 0;

        int bitNo = 0;

        while(true){

            if( (totalXor & (1<<bitNo)) != 0){
                break;
            }
            bitNo++;
        }

        for(int i = 0; i < n; i++){

            if( (arr.get(i) & (1<<bitNo)) == 0){
                zeros ^= arr.get(i);
            }else{
                ones ^= arr.get(i);
            }
        }

        for(int i = 1 ; i <= n ; i++){

            if( (i & (1<<bitNo)) == 0){
                zeros ^= i;
            }else{
                ones ^= i;
            }
        }

        int c = 0;
        for(int i = 0 ; i < n ; i++){

            if(arr.get(i) == zeros){
                c++;
            }
        }

        if(c == 2){
            ans[0] = ones;
            ans[1] = zeros;
        }else{
            ans[0] = zeros;
            ans[1] = ones;
        }

        return ans;
    }
}
