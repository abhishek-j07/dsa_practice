package BinarySearch;

public class KokoEatingBanana {

    public static void main(String[] args) {

        int[] arr = {3,6,7,11};
        KokoEatingBanana k = new KokoEatingBanana();
        System.out.println(k.minEatingSpeed(arr,8));
    }

    public int minEatingSpeed(int[] piles, int h) {

        int m = max(piles);
        int ans = m;

        int low = 1;
        int high = m;

        while(low <= high){

            int mid = (low + high)/2;
            int tot = totalRemaining(piles,mid);

            if(tot <= h){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return ans;
    }

    public int max(int[] a){

        int max = Integer.MIN_VALUE;

        for(Integer i : a){
            max = Math.max(max,i);
        }

        return max;
    }

    public int totalRemaining(int[] a, int k){

        int total = 0;

        for(Integer i : a){
            total += Math.ceil(i*1.0/k);
        }

        return total;
    }
}

