package BinarySearch;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2};
        int[] arr2 = {3,4};

        MedianOfTwoSortedArrays m = new MedianOfTwoSortedArrays();
        System.out.println(m.findMedianSortedArrays(arr1,arr2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 =  nums1.length;
        int n2 = nums2.length;

        if(n1 > n2){
            return findMedianSortedArrays(nums2,nums1);
        }

        int l = 0;
        int h = n1;

        int left = (n1+n2+1)/2;
        int n = n1+n2;

        while(l <= h){

            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;
            int mid1 = (l+h)/2;
            int mid2 = left-mid1;

            if(mid1-1 >= 0){
                l1 = nums1[(int) (mid1-1)];
            }

            if(mid2-1 >= 0){
                l2 = nums2[(int) (mid2-1)];
            }

            if (mid1 < n1) {
                r1 = nums1[mid1];
            }

            if (mid2 < n2) {
                r2 = nums2[mid2];
            }

            if(l1 <= r2 && l2 <= r1){
                if(n % 2 != 0){
                    return Math.max(l1,l2);
                }else{
                    return (Math.max(l1,l2) + Math.min(r1,r2))/2.0;
                }
            }else if(l1 > r2){
                h = mid1-1;
            }else{
                l = mid1+1;
            }
        }

        return 0.0;
    }
}
