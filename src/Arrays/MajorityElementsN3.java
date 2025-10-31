package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MajorityElementsN3 {

    public static void main(String[] args) {

        int[] arr = {2,2};
        MajorityElementsN3 majorityElementsN3 = new MajorityElementsN3();
        System.out.println(majorityElementsN3.optimizedMajorityElement(arr));
    }

    public List<Integer> optimizedMajorityElement(int[] nums) {

        List<Integer> res = new ArrayList<>();
        int len = nums.length;
        int req = (int) Math.floor(len/3);

        int cnt1 = 0;
        int cnt2 = 0;
        int ele1 = 0;
        int ele2 = 0;

        for (int i = 0 ; i < len ; i++){

            if (cnt1 == 0 && nums[i] != ele2) {
                ele1 = nums[i];
                cnt1++;
            } else if (cnt2 == 0 && nums[i] != ele1) {
                ele2 = nums[i];
                cnt2++;
            } else if ( nums[i] == ele1) {
                cnt1++;
            } else if (nums[i] == ele2) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;

        for(int i = 0 ; i < len; i++){
            if(nums[i] == ele1){
                cnt1++;
            }else if(nums[i] == ele2){
                cnt2++;
            }
        }

        if(cnt1 > req){
            res.add(ele1);
        }

        if(cnt2 > req){
            res.add(ele2);
        }

        return res;
    }

    public List<Integer> majorityElement(int[] nums) {

        List<Integer> res = new ArrayList<>();
        int len = nums.length;
        int req = (int) Math.floor(len/3);

        Arrays.sort(nums);
        int c = 0;
        int n = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if(n == nums[i]){
                c++;
            }else{
                n = nums[i];
                c = 1;
            }

            if(c > req && !res.contains(nums[i])){
                res.add(nums[i]);
            }

        }

        return res;
    }
}
