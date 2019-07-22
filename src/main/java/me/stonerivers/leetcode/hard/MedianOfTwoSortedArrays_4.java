package me.stonerivers.leetcode.hard;

/**
 * @author Zhangyuanan
 * @version 1.0
 * @since 2019-06-30
 */
public class MedianOfTwoSortedArrays_4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int len1 = nums1.length;
        int len2 = nums2.length;

        int start = (len1 + len2 + 1) / 2 - 1;
        int end = (len1 + len2) / 2 + 1 - 1;

        return merge(nums1, nums2, start, end);
    }


    private double merge(int[] nums1, int[] nums2, int aimIndex1, int aimIndex2) {

        int len1 = nums1.length;
        int len2 = nums2.length;

        boolean success = false;

        int aim1 = 0, aim2 = 0;

        int index1 = 0, index2 = 0, index = 0;
        while (index1 < len1 && index2 < len2 && !success) {
            if (nums1[index1] < nums2[index2]) {
                if (index == aimIndex1) {
                    aim1 = nums1[index1];
                }
                if (index == aimIndex2) {
                    aim2 = nums1[index1];
                    success = true;
                }
                index++;
                index1++;
            } else {
                if (index == aimIndex1) {
                    aim1 = nums2[index2];
                }
                if (index == aimIndex2) {
                    aim2 = nums2[index2];
                    success = true;
                }
                index++;
                index2++;
            }
        }

        while (index1 < len1 && !success) {
            if (index == aimIndex1) {
                aim1 = nums1[index1];
            }
            if (index == aimIndex2) {
                aim2 = nums1[index1];
                success = true;
            }
            index++;
            index1++;
        }

        while (index2 < len2 && !success) {
            if (index == aimIndex1) {
                aim1 = nums2[index2];
            }
            if (index == aimIndex2) {
                aim2 = nums2[index2];
                success = true;
            }
            index++;
            index2++;
        }
        return ((double) (aim1 + aim2)) / 2;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1, 2};
        int[] num2 = new int[]{3, 4};
        System.out.println(new MedianOfTwoSortedArrays_4().findMedianSortedArrays(num1, num2));
    }
}
