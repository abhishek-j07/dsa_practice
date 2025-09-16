package knowBasicMath;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args){

        System.out.println(findArmstrongNumber(371));

    }

    public static boolean findArmstrongNumber(int n){

        int ans = 0;
        int num = n;
        int digits = (int) (Math.log10(n)+1);
        while(n != 0){

            int lastDigit = n % 10;
            ans += (int) Math.pow(lastDigit, digits);
            n = n/10;
        }

        return ans == num;
    }

}
