package Recursion;

public class PrintNTo1 {

    public static void main(String[] args) {

        printNTo1(5);
    }

    public static void printNTo1(int n){

        if(n < 1){
            return;
        }

        System.out.println(n);
        printNTo1(n-1);
    }
}
