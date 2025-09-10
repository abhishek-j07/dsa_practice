package knowBasicMath;

public class ReverseNumber {

    public static void main(String[] args) {

        System.out.println(reverseNumber(12543));
    }

    public static int reverseNumber(int x) {

        int ans = 0;

        while(x != 0){
            int lastDigit = x%10;

            if(ans > Integer.MAX_VALUE/10 ||
                    ans < Integer.MIN_VALUE/10){
                return 0;
            }

            ans = (ans*10) + lastDigit;

            x = x/10;
        }

        return ans;
    }
}
