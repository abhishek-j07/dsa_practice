package Patterns;

public class Pattern14 {

    public static void main(String[] args) {

        Pattern14 pattern = new Pattern14();
        pattern.printDownPattern(6);
        pattern.printUpPattern(6);
    }

    public void printDownPattern(int stars){

        for(int i = 0 ; i < stars ; i++){

            int spaces = 2*i;
            int s = ((2*stars)-spaces)/2;

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

        for(int i = stars-1 ; i >= 0 ; i--){

            int spaces = 2*i;
            int s = ((2*stars)-spaces)/2;

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
