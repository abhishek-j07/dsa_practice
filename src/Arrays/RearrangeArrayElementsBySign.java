package Arrays;

public class RearrangeArrayElementsBySign {

    public static void main(String[] args) {

        int[] arr = {39,-8,-28,46,-16,-21,-12,49,14,-46,22,9};
        RearrangeArrayElementsBySign obj = new RearrangeArrayElementsBySign();

        for(Integer i : obj.rearrangeArray(arr)){
            System.out.print(i+" ");
        }
    }

    public int[] rearrangeArray(int[] nums) {

        int i = 0;
        int j = 0;
        int n  = nums.length;
        int[] ans = new int[n];
        int idx = 0;
        boolean isPositiveTurn = false;
        boolean isNegativeTurn = false;
        boolean isFirstElement = true;

        while(i < n && j < n){

            if(isFirstElement)
                if (nums[i] > 0) {
                    ans[idx] = nums[i];
                    isFirstElement = false;
                    isPositiveTurn = false;
                    isNegativeTurn = true;
                    idx++;
                    i++;
                }else{
                    i++;
                }

            if (isPositiveTurn){
                if(nums[i] > 0){
                    ans[idx] = nums[i];
                    isPositiveTurn = false;
                    isNegativeTurn = true;
                    idx++;
                    i++;
                }else {
                    i++;
                }
            }

            if(isNegativeTurn){
                if(nums[j] < 0) {
                    ans[idx] = nums[j];
                    isNegativeTurn = false;
                    isPositiveTurn = true;
                    idx++;
                    j++;
                }else {
                    j++;
                }
            }
        }

        while(i < n && idx < n){
            if(nums[i] > 0) {
                ans[idx] = nums[i];
                idx++;
            }
            i++;
        }

        while(j < n && idx < n){
            if(nums[j] < 0) {
                ans[idx] = nums[j];
                idx++;
            }
            j++;
        }

        return ans;
    }
}
