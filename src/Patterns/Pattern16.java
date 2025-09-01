package Patterns;

public class Pattern16 {

    public static void main(String[] args) {

        Pattern16 pattern = new Pattern16();
        pattern.printDownPattern(6);
    }

    public void printDownPattern(int stars){

        for(int i=0 ; i < stars ; i++){
            if(i == 0 || i == stars-1){
                for(int j = 0 ; j < stars ; j++){
                    System.out.print("*");
                }
                System.out.println();
                continue;
            }

            for(int j = 0 ; j < stars ; j++){
                if(j == 0 || j == stars-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
