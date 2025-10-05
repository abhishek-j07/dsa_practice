package Arrays;

public class NumberAppearOnce {

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4,4,5,5};
        NumberAppearOnce numberAppearOnce = new NumberAppearOnce();
        System.out.println(numberAppearOnce.singleNumber(arr));
    }

    public int singleNumber(int[] nums) {

        int singleNumber = 0;

        for(Integer num : nums){

            singleNumber ^= num;
        }

        return singleNumber;
    }
}
