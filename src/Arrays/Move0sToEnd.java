package Arrays;

public class Move0sToEnd {

    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4,5};
        Move0sToEnd move = new Move0sToEnd();
        move.moveZeroes(arr);

        for(Integer i:arr){
            System.out.print(i+" ");
        }
    }

    public void moveZeroes(int[] nums) {

        int i = 0;
        int j = 1;
        int n = nums.length;

        while(i < n && j < n){

            if(nums[i] == 0){
                if(nums[j] != 0){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    i++;
                    j++;
                }else{
                    j++;
                }
            }else{
                i++;
                j++;
            }
        }
    }
}
