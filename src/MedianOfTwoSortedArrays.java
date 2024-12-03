public class MedianOfTwoSortedArrays {

//    Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//    Input: nums1 = [1,3], nums2 = [2]
//    Output: 2.00000
//    Explanation: merged array = [1,2,3] and median is 2.

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] sum = new int[nums1.length + nums2.length];

        int nums1index = 0;
        int nums2index = 0;

        for (int i = 0; i < sum.length; i++) {
            if (nums1index < nums1.length && nums2index < nums2.length) {
                if (nums1[nums1index] < nums2[nums2index]) {
                    sum[i] = nums1[nums1index];
                    nums1index++;
                } else {
                    sum[i] = nums2[nums2index];
                    nums2index++;
                }
            } else if (nums1index < nums1.length) {
                sum[i] = nums1[nums1index];
                nums1index++;
            } else {
                sum[i] = nums2[nums2index];
                nums2index++;
            }
        }

        int mid = (sum.length) / 2;

        if (sum.length % 2 == 0) {
            return ((double) (sum[mid] + sum[mid - 1])) / 2;
        } else {
            return sum[mid];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {2};
        int[] nums2 = {};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
