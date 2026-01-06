package BinarySearch;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KthElementOfTwoSortedArray {

    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.of(23, 34, 234, 235, 2311);
        ArrayList<Integer> a = stream1.collect(Collectors.toCollection(ArrayList::new));

        Stream<Integer> stream2 = Stream.of(2,4,6,8);
        ArrayList<Integer> b = stream2.collect(Collectors.toCollection(ArrayList::new));

        System.out.println(kthElement(a,b,5,4,4));
    }

    public static int kthElement(ArrayList<Integer> a, ArrayList<Integer> b, int n, int m, int k) {

        if(m < n){

            return kthElement(b,a,m,n,k);
        }

        int l = Math.max(0, k - n), h = Math.min(k, m);
        int left = k;

        while(l <= h){

            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;
            int mid1 = (l+h)/2;
            int mid2 = left-mid1;

            if(mid1-1 > 0){
                l1 = a.get(mid1-1);
            }

            if(mid2-1 > 0){
                l2 = b.get(mid2-1);
            }

            if (mid1 < n) {
                r1 = a.get(mid1);
            }

            if (mid2 < m) {
                r2 = b.get(mid2);
            }

            if(l1 <= r2 && l2 <= r1){
                    return Math.max(l1,l2);

            }else if(l1 > r2){
                h = mid1-1;
            }else{
                l = mid1+1;
            }
        }

        return 0;
    }
}
