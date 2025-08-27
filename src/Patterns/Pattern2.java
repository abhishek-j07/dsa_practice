package Patterns;

public class Pattern2 {

    public static void main(String[] args) {

        Pattern2 pattern2 = new Pattern2();
        pattern2.printPattern(5);
    }

    public void printPattern(int stars){
        for(int i = 0 ; i < stars ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
