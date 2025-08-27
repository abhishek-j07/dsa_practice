package Patterns;

public class Pattern6 {

    public static void main(String[] args) {

        Pattern6 pattern = new Pattern6();
        pattern.printPattern(5);
    }

    public void printPattern(int stars){
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
