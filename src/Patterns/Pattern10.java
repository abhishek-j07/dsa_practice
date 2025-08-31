package Patterns;

public class Pattern10 {

    public static void main(String[] args) {

        Pattern10 pattern = new Pattern10();
        pattern.printPattern(5);
    }

    public void printPattern(int stars){

        for(int i = 1 ; i <= stars; i++){

            int j = 1;

            for(j = 1 ; j <= i ; j++){
                System.out.print(j);
            }

            for( ; j <= stars ; j++){
                System.out.print(" ");
            }

            for(j = j-1 ; j > i ; j--){
                System.out.print(" ");
            }

            for( ; j >= 1 ; j--){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
