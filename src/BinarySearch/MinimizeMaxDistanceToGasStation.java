package BinarySearch;

public class MinimizeMaxDistanceToGasStation {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        System.out.println(MinimiseMaxDistance(arr,4));
    }

    public static double MinimiseMaxDistance(int []arr, int K){

        double l = 0.0;
        double h = 0.0;
        for (int i = 0; i < arr.length - 1; i++) {
            h = Math.max(h, arr[i + 1] - arr[i]);
        }
        double ans = 0;

        while(h - l > 1e-6){

            double mid = (l+h)/2.0;

            int stations = numberOfStations(arr,mid);

            if(stations > K){
                l = mid;
            }else{
                h = mid;
                ans = mid;
            }
        }

        return h;
    }

    private static int numberOfStations(int[] arr, double distance) {

        int stations = 0;

        for(int i = 1; i < arr.length; i++){

            int stnInBetween = (int) ((arr[i] - arr[i-1])/distance);

            if((arr[i] - arr[i-1]) == (distance*stnInBetween)){
                stnInBetween--;
            }

            stations += stnInBetween;
        }

        return stations;
    }
}
