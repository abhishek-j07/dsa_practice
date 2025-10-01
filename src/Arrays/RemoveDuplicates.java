package Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        int i = 0;
        int j = i+1;
        int n = nums.length;

        while (i < n && j < n) {

            if(nums[i] == nums[j]){
                j++;
            }else{
                i++;
                swap(nums,i,j);
                j++;
            }
        }

        return i+1;
    }

    private static void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
