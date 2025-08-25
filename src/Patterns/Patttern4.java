package Patterns;

public class Patttern4 {

    public static void main(String[] args) {

        Patttern4 pattern = new Patttern4();
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
