package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SubarraysWithXorK {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 8, 3, 10));
        System.out.println(subarraysXor(arr, 8));

    }

    public static int subarraysXor(ArrayList<Integer> arr, int x) {

        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int total = 0;

        map.put(0,1);

        for (int i = 0; i < arr.size(); i++) {

            total ^= arr.get(i);

            if (map.containsKey(total ^ x)) {
                ans += map.get(total ^ x);
            }

            map.put(total, map.getOrDefault(total, 0) + 1);


        }

        return ans;
    }
}
