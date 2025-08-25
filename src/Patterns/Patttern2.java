package Patterns;

public class Patttern2 {

    public static void main(String[] args) {

        Patttern2 patttern2 = new Patttern2();
        patttern2.printPattern(5);
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
