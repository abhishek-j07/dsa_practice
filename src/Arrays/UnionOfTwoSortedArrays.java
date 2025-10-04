package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UnionOfTwoSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2,3,4,4,5,11,12};

        System.out.println(union(arr1, arr2));
    }

    public static List<Integer> union(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        ArrayList<Integer> unionList = new ArrayList<>();

        if(arr1[i] <= arr2[j]){
            unionList.add(arr1[i]);
            i++;
        }else{
            unionList.add(arr2[j]);
            j++;
        }

        while(i < n1 && j < n2) {

            if(arr1[i] <= arr2[j]) {
                if(arr1[i] == unionList.get(unionList.size()-1)){
                    i++;
                }else{
                    unionList.add(arr1[i]);
                    i++;
                }

            }else{
                if(arr2[j] == unionList.get(unionList.size()-1)) {
                    j++;
                }else{
                    unionList.add(arr2[j]);
                    j++;
                }
            }
        }

        while(i < n1){
            if(arr1[i] != unionList.get(unionList.size()-1)) {
                unionList.add(arr1[i]);
            }

            i++;
        }

        while(j < n2){
            if(arr2[j] != unionList.get(unionList.size()-1)) {
                unionList.add(arr2[j]);
            }

            j++;
        }

        return unionList;
    }
}
