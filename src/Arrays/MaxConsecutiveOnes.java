package Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        int[] arr1 = {1,1,0,1,1,1};
        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
        System.out.println(obj.findMaxConsecutiveOnes(arr1));
    }

    public int findMaxConsecutiveOnes(int[] nums) {

        int maxOnes = 0;
        int count = 0;

        for(Integer num : nums){

            if(num == 1){
                count++;
                maxOnes = Math.max(maxOnes,count);
            }else{
                count = 0;
            }
        }

        return maxOnes;

    }
}
