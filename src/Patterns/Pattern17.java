package Patterns;

public class Pattern17 {

    public static void main(String[] args) {

        Pattern17 pattern = new Pattern17();
        pattern.printDownPattern(3);
    }

    public void printDownPattern(int stars){

        for(int i = 0 ; i < 2*stars-1 ; i++){
            for(int j = 0 ; j < 2*stars-1 ; j++){

                int topDistance = i;
                int leftDistance = j;
                int bottomDistance = (2*stars-2)-i;
                int rightDistance = (2*stars-2)-j;

                int min0 = Math.min(topDistance, leftDistance);
                int min1 = Math.min(bottomDistance, rightDistance);
                int minDistance = Math.min(min0, min1);

                System.out.print(stars-minDistance);
            }

            System.out.println();
        }
    }
}
