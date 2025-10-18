package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class LeaderInArray {

    public static void main(String[] args) {

        LeaderInArray leader = new LeaderInArray();
    }

    public static ArrayList<Integer> findLeaders(ArrayList<Integer> elements, int n) {

        ArrayList<Integer> result = new ArrayList<>();
        int max = elements.get(n-1);

        result.add(max);

        for(int i = n-2 ; i >= 0 ; i--){
            if(elements.get(i) > max){
                max = elements.get(i);
                result.add(max);
            }
        }

        Collections.reverse(result);

        return result;
    }
}
