package Patterns;

public class Pattern13 {

    public static void main(String[] args) {

        Pattern13 pattern = new Pattern13();
        pattern.printPattern(5);
    }

    public void printPattern(int stars){

        for(int i = stars-1 ; i >= 0; i--){
            for(int j = i ; j < stars ; j++){
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
}
