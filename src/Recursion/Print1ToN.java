package Recursion;

public class Print1ToN {

    public static void main(String[] args) {

        print1ToN(11);
    }

    public static void print1ToN(int n){

        if(n < 1){
            return;
        }

        print1ToN(n-1);

        System.out.println(n);
    }
}
