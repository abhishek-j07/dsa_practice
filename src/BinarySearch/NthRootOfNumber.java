package BinarySearch;

public class NthRootOfNumber {

    public static void main(String[] args) {

        System.out.println(getNthRoot(4,69));
    }

    public static int getNthRoot(int x, int n){

        int l = 1;
        int h = n/3;

        while(l <= h){

            int m = (l+h)/2;

            if(Math.pow(m,x) < n){
                l = m+1;
            }else if(Math.pow(m,x) > n){
                h = m-1;
            }else {
                return m;
            }
        }

        return -1;
    }
}
