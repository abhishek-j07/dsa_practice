package Patterns;

public class Pattern8 {

    public static void main(String[] args) {

        Pattern8 pattern = new Pattern8();
        pattern.optimizedPattern(5);
    }

    public void printPattern(int stars){
        int i = 0;
        for(i = 0 ; i <= stars ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int k = i-2 ; k > 0 ; k--){
            for(int j = 0 ; j < k ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void optimizedPattern(int stars){

        for(int i = 1 ; i <= 2*stars-1 ; i++){

            int s = i;

            if(i > stars){
                s = 2*stars-i;
            }

            for(int j = 0 ; j < s ; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
