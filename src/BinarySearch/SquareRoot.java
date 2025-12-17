package BinarySearch;

public class SquareRoot {

    public static void main(String[] args) {

        long n = 36;

        System.out.println(sqrtN(n));
    }

    public static int sqrtN(long N) {

        long ans = 0;

        long l = 1;
        long h = N/2;

        while(l <= h){

            long m = (l+h)/2;

            if(m*m <= N){
                ans = m;
                l = m+1;
            }else{
                h = m-1;
            }
        }

        return (int)ans;
    }
}
