package Patterns;

public class Pattern9 {

    public static void main(String[] args) {

        Pattern9 pattern = new Pattern9();
        pattern.printPattern(5);
    }

    public void printPattern(int stars){

        for(int i = 1 ; i <= stars; i++){

            int j = 1;

            if(i % 2 == 0) {
                j = 0;
            }

            for(int k = 0 ; k < i; k++) {
                System.out.print(Math.abs(j));
                j = 1-j;
            }

            System.out.println();
        }
    }
}
