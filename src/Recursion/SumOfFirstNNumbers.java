package Recursion;

public class SumOfFirstNNumbers {

    public static void main(String[] args) {

        System.out.println(sum(4,0));
        System.out.println(sum2(4));
    }

    public static int sum(int n, int s){

        if(n < 1){
            return s;
        }

        return sum(n-1,s + n);

    }

    public static int sum2(int n){

        if(n == 0){
            return 0;
        }

        return n + sum2(n-1);
    }
}
