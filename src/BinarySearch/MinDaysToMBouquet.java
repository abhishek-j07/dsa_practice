package BinarySearch;

public class MinDaysToMBouquet {

    public static void main(String[] args) {

        int[] arr = {1,10,3,10,2};

        MinDaysToMBouquet obj = new MinDaysToMBouquet();

        System.out.println(obj.minDays(arr,3,1));
    }

    public int minDays(int[] bloomDay, int m, int k) {

        if ((long) m * k > bloomDay.length) return -1;

        int min = min(bloomDay);
        int max = max(bloomDay);
        int ans = 0;
        int l = min;
        int h = max;

        while(l <= h){

            int mid = (l+h)/2;

            if(noOfBouquets(bloomDay,mid,m,k)){
                ans = mid;
                h = mid-1;
            }else{
                l = mid+1;
            }
        }

        return ans;

    }

    public int min(int[] arr){

        int min = Integer.MAX_VALUE;

        for(Integer i : arr){
            min = Math.min(min,i);
        }

        return min;
    }

    public int max(int[] arr){

        int max = Integer.MIN_VALUE;

        for(Integer i : arr){
            max = Math.max(max,i);
        }

        return max;
    }

    public boolean noOfBouquets(int[] arr, int mid, int m, int k){

        int total = 0;
        int c = 0;

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] <= mid){
                c++;
            }else{
                total += (c/k);
                c = 0;
            }
        }

        total += (c/k);

        return total>=m;
    }


}

