package Patterns;

public class Pattern15 {

    public static void main(String[] args) {

        Pattern15 pattern = new Pattern15();
        pattern.printDownPattern(6);
        pattern.printUpPattern(6);
    }

    public void printDownPattern(int stars){

        for(int i = 0 ; i < stars ; i++){

            int s = i+1;
            int spaces = (2*stars)-(2*s);

            for(int j = 0 ; j < s ; j++){
                System.out.print("*");
            }

            for(int j = 0 ; j < spaces ; j++){
                System.out.print(" ");
            }

            for(int j = 0 ; j < s ; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void printUpPattern(int stars){

        for(int i = stars-2 ; i >= 0 ; i--){

            int s = i+1;
            int spaces = (2*stars)-(2*s);

            for(int j = 0 ; j < s ; j++){
                System.out.print("*");
            }

            for(int j = 0 ; j < spaces ; j++){
                System.out.print(" ");
            }

            for(int j = 0 ; j < s ; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
