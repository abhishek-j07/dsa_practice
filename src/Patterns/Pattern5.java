package Patterns;

public class Pattern5 {

    public static void main(String[] args) {

        Pattern5 pattern = new Pattern5();
        pattern.printPattern(6);
    }

    public void printPattern(int stars){
        for(int i = 0 ; i < stars ; i++){
            for(int j = 0 ; j < stars-i-1 ; j++){
                System.out.print(" ");
            }

            for(int k = 0 ; k < (2*i)+1 ; k++){
                System.out.print("*");
            }

            for(int j = 0 ; j < stars-i-1 ; j++){
                System.out.print("");
            }

            System.out.println();
        }
    }
}
