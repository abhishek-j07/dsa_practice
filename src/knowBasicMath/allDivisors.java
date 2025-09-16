package knowBasicMath;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class allDivisors {

    public static void main(String[] args) {

        System.out.println(findAllDivisors(36));
    }

    public static HashSet<Integer> findAllDivisors(int num){

        HashSet<Integer> list = new HashSet<>();

        for(int i = 1 ; i*i <= num ; i++){
            if(num % i == 0){
                list.add(i);
                list.add(num/i);
            }
        }

        return list;
    }
}
