package Recursion;

public class FibonacciNumber {

    public static void main(String[] args) {

        FibonacciNumber f = new FibonacciNumber();
        System.out.println(f.fib(4));
    }

    public int fib(int n) {

        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        return fib(n-1)+fib(n-2);
    }
}
