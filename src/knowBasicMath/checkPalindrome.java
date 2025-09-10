package knowBasicMath;

public class checkPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12176));
    }

    public static boolean isPalindrome(int x) {

        boolean isPalindrome = false;

        int rev = reverse(x);

        if(rev < 0){
            return false;
        }

        return x==rev ? true:false;

    }

    public static int reverse(int x){

        int rev = 0;

        while(x != 0){

            int lastDigit = x%10;

            if(rev > (Integer.MAX_VALUE/10) ||
                    rev < (Integer.MIN_VALUE/10)){
                return 0;
            }

            rev = (rev * 10) + lastDigit;
            x = x / 10;
        }

        return rev;
    }
}
