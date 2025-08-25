package Patterns;

public class Patttern3 {

    public static void main(String[] args) {

        Patttern3 patttern3 = new Patttern3();
        patttern3.printPattern(5);
    }

    public void printPattern(int stars){
        for(int i = 1 ; i <= stars ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
