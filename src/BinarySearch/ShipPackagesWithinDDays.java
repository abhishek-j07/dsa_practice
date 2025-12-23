package BinarySearch;

public class ShipPackagesWithinDDays {

    public static void main(String[] args) {

        int[] arr = {3,2,2,4,1,4};

        ShipPackagesWithinDDays ship = new ShipPackagesWithinDDays();
        System.out.println(ship.shipWithinDays(arr,3));
    }

    public int shipWithinDays(int[] weights, int days) {

        int ans = 0;

        int max = max(weights);
        int tot = total(weights);
        int l = max;
        int h = tot;

        while(l <= h){

            int mid = l + (h - l)/2;
            boolean possible = isPossible(weights,mid,days);
            if(possible){
                h   = mid - 1;
                ans = mid;
            }else{
                l = mid + 1;
            }
        }

        return ans;
    }

    private int total(int[] arr){

        int total = 0;

        for(Integer i : arr){
            total += i;
        }

        return total;
    }

    private boolean isPossible(int[] weights, int shipCap, int days) {

        int total = 0;
        int d = 1;

        for(int i = 0; i < weights.length; i++){

            if(total + weights[i] > shipCap){

                d++;
                total = weights[i];

            }else{
                total += weights[i];
            }
        }

        return d <= days;
    }

    public int max(int[] arr){

        int max = Integer.MIN_VALUE;

        for(Integer i : arr){
            max = Math.max(max,i);
        }

        return max;
    }
}
