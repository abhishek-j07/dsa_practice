package Recursion;

public class CountGoodNumbers {

    public static void main(String[] args) {

        CountGoodNumbers obj = new CountGoodNumbers();
        System.out.println(obj.countGoodNumbers(1));
    }

    public int countGoodNumbers(long n) {

        long even = (int)(n+1)/2;
        long odd = (int)n/2;

        long e = (myPow(5l,even));
        long o = (myPow(4l,odd));

        long ans = (e*o) % 1000000007;

        return (int) ans;
    }

    private long power(long x, long n) {
        if (n == 0) return 1;

        if (n == 1) return x;

        x = x  % 1000000007;

        if (n % 2 == 0) {
            x = (x * x) % 1000000007;
            return (power(x, n / 2));
        }

        x = x % 1000000007;
        return (x * power(x, n - 1)) % 1000000007;
    }

    public long myPow(long x, long n) {
        long num = n;
        if (num < 0) {
            return 1 / power(x, -num);
        }
        x = x % 1000000007;
        return (power(x, num)) % 1000000007;
    }
}
