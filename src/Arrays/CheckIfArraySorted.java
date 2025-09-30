package Arrays;

public class CheckIfArraySorted {

    public static void main(String[] args) {

        int[] arr = new int[]{3,4,5,1,2};

        System.out.println(check(arr));
    }

    public static boolean check(int[] nums) {

        boolean isSortedOrRotated = true;
        int c = 0;
        int n = nums.length;

        for(int i = 0 ; i < n ; i++){

            if(nums[i] > nums[(i+1) % n]){
                c++;

                if(c == 2){
                    return false;
                }
            }

        }

        return isSortedOrRotated;
    }
}

