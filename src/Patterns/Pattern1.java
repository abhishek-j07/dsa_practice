package Patterns;

public class Pattern1 {

    public static void main(String[] args) {

        Pattern1 pattern1 = new Pattern1();
        pattern1.printPattern(5);
    }

    public void printPattern(int stars){
        for(int i = 0 ; i < stars ; i++){
            for(int j = 0 ; j < stars ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
