package BasicHashing;

import java.util.HashMap;

public class FrequencyOfElement {

    public static void main(String[] args) {

        int[] arr = {1,1,3,2,6,4,8,99,4,5};
        frequencyOfElement(arr);
    }

    public static void frequencyOfElement(int[] arr){

        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }

        System.out.println(map);
    }
}
