package Patterns;

public class Pattern12 {

    public static void main(String[] args) {

        Pattern12 pattern = new Pattern12();
        pattern.printPattern(6);
    }

    public void printPattern(int stars){

        for(int i = stars-1 ; i >= 0 ; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" ");
            }

            int k = 0;
            for( ; k < stars-i ; k++){
                System.out.print((char)('A' + k));
            }

            for(k = k-2 ; k >= 0 ; k--){
                System.out.print((char)('A' + k));
            }

            for(int j = 0 ; j <= i ; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
