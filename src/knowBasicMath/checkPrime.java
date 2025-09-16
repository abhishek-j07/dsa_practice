package knowBasicMath;

public class checkPrime {

    public static void main(String[] args) {

        System.out.println(isPrime(2));
    }

    public static boolean isPrime(int num){

        boolean isPrime = true;

        for(int i = 2 ; i*i <= num ; i++){
            if(num % i == 0){
                isPrime = false;
            }
        }

        return isPrime;
    }
}
