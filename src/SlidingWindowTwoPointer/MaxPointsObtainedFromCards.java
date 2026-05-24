package SlidingWindowTwoPointer;

public class MaxPointsObtainedFromCards {

    public static void main(String[] args) {

    }

    public int maxScore(int[] cardPoints, int k) {

        int max = -1;
        int lsum = 0;
        int rsum = 0;
        int n = cardPoints.length;
        int ridx = n-1;

        for(int i = 0 ; i < k ; i++){
            lsum += cardPoints[i];
        }

        max = lsum;

        for(int i = k-1 ; i >= 0 ; i--){

            lsum -= cardPoints[i];
            rsum += cardPoints[ridx];
            ridx--;

            max = Math.max(max, lsum + rsum);
        }

        return max;

    }
}
