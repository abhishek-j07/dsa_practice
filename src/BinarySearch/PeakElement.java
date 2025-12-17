package BinarySearch;

public class PeakElement {

    public static void main(String[] args) {

        int[] arr = {1,2,3,1};

        PeakElement peak = new PeakElement();
        int ans = peak.findPeakElement(arr);
        System.out.println(ans);
    }

    public int findPeakElement(int[] nums) {

        int l = 0;
        int h = nums.length-2;

        while(l <= h){

            int m = l + (h-l)/2;

            if(nums[m] < nums[m+1]){
                l =  m+1;
            }else{
                h = m-1;
            }
        }

        return l;
    }
}
