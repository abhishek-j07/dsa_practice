package Recursion;

public class MyPower {

    public static void main(String[] args) {

        MyPower myPower = new MyPower();
        System.out.println(myPower.myPow(2.1,5));
    }

    private double power(double x, long n) {
        if (n == 0) return 1.0;

        if (n == 1) return x;

        if (n % 2 == 0) {
            return power(x * x, n / 2);
        }

        return x * power(x, n - 1);
    }

    public double myPow(double x, int n) {
        long num = n;
        if (num < 0) {
            return 1.0 / power(x, -num);
        }
        return power(x, num);
    }
}
