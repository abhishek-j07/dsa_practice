package Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        MissingNumber missingNumber = new MissingNumber();
        int[] arr1 = {0,1,3};
        System.out.println(missingNumber.missingNumber(arr1));
    }

    public int missingNumber(int[] nums) {

        int n = nums.length;

        int total = (n*(n+1))/2;

        int sum = 0;

        for(Integer i : nums){
            sum += i;
        }

        return total-sum;

    }
}
