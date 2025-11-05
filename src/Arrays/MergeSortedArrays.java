package Arrays;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = {7,8,9,0,0,0};
        int[] arr2 = {1,2,3};

        MergeSortedArrays obj = new MergeSortedArrays();
        obj.merge(arr1,3,arr2,3);
        System.out.println(Arrays.toString(arr1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int left = m-1;
        int right = n-1;

        int i = m+n-1;

        while(left >= 0 && right >= 0){

            if(nums1[left] >= nums2[right]){
                nums1[i] = nums1[left];
                i--;
                left--;
            }else{
                nums1[i] = nums2[right];
                i--;
                right--;
            }
        }

        while(right >= 0){
            nums1[i] = nums2[right];
            i--;
            right--;
        }

    }

    public void swap(int[] a,int[] b, int i, int j){
        int temp = a[i];
        a[i] = b[j];
        b[j] = temp;
    }
}
