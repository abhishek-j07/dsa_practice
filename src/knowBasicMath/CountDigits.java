package knowBasicMath;

public class CountDigits {

    public static void main(String[] args) {

        CountDigits countDigits = new CountDigits();
        System.out.println(countDigits.bruteForceNumberOfDigits(12345));
        System.out.println(countDigits.optimalNumberOfDigits(12345));

    }

    private int bruteForceNumberOfDigits(int num){

        int count = 0;

        while(num != 0){
            num /= 10;
            count++;
        }

        return count;
    }

    private int optimalNumberOfDigits(int num){

        int count = 0;

        count = (int)Math.log10(num)+1;

        return count;
    }

}

