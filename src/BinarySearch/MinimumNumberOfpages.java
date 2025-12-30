package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumNumberOfpages {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(17);
        arr.add(14);
        arr.add(9);
        arr.add(15);
        arr.add(9);
        arr.add(14);

        System.out.println(findPages(arr,4,7));
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {

        if(m > arr.size()){
            return -1;
        }

        int ans = 0;
        int l = findMax(arr);
        int h = getTotal(arr);

        while(l <= h){

            int mid = (l+h)/2;

            if(canAllocate(arr,mid,m)){
                ans = mid;
                h = mid-1;
            }else {
                l = mid+1;
            }
        }

        return ans;
    }

    private static boolean canAllocate(ArrayList<Integer> arr, int pages, int students) {

        int totalStudents = 1;
        int totalPages = 0;

        for(int i = 0; i < arr.size(); i++){

            totalPages += arr.get(i);

            if(totalPages > pages){
                totalPages = arr.get(i);
                totalStudents++;
            }
        }

        return totalStudents <= students;
    }


    public static int findMax(ArrayList<Integer> arr){

        int max = Integer.MIN_VALUE;

        for(Integer i : arr){
            max = Math.max(max,i);
        }

        return max;
    }

    public static int getTotal(ArrayList<Integer> arr){

        int total = 0;

        for(Integer i : arr){
            total += i;
        }

        return total;
    }
}
