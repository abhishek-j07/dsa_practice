package Patterns;

public class Pattern7 {

    public static void main(String[] args) {

        Pattern7 pattern = new Pattern7();
        pattern.printDownwardPattern(5);
        pattern.printUpwardPattern(5);
    }

    public void printDownwardPattern(int stars){
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

    public void printUpwardPattern(int stars){
        for(int i = 0 ; i < stars ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }

            for(int k = (2*stars)-i-1 ; k > i  ; k--){
                System.out.print("*");
            }

            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
