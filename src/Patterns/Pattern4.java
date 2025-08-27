package Patterns;

public class Pattern4 {

    public static void main(String[] args) {

        Pattern4 pattern = new Pattern4();
        pattern.printPattern(5);
    }

    public void printPattern(int stars){
        for(int i = 0 ; i < stars ; i++){
            for(int j = stars ; j > i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
