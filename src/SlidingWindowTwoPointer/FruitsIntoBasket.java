package SlidingWindowTwoPointer;

import java.util.HashMap;

public class FruitsIntoBasket {

    public static void main(String[] args) {

    }

    public static int findMaxFruits(int []arr, int n) {

        int fruits = 0;
        int left = 0;
        int right = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(right < n){

            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while(map.size() > 2){

                map.put(arr[left], map.getOrDefault(arr[left], 0) - 1);

                if(map.get(arr[left]) == 0){
                    map.remove(arr[left]);
                }

                left++;
            }

            fruits = Math.max(fruits, right - left + 1);
            right++;
        }

        return fruits;
    }
}
