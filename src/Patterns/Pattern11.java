package Patterns;

public class Pattern11 {

    public static void main(String[] args) {

        Pattern11 pattern = new Pattern11();
        pattern.printPattern(5);
        pattern.printReversePattern(5);
    }

    public void printPattern(int stars){

        for(int i = 0 ; i <= stars; i++){
            for(int j = 0 ; j < i; j++){
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
    }

    public void printReversePattern(int stars){

        for(int i = stars ; i >= 1; i--){
            for(int j = 0 ; j < i; j++){
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
    }
}
