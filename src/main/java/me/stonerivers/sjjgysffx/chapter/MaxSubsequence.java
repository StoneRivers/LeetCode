package me.stonerivers.sjjgysffx.chapter;

/**
 * @author Zhangyuanan
 * @version 1.0
 * @since 2018/10/15
 */
public class MaxSubsequence {


    public static int getMaxSum(int[] nums) {
        int sumMax = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int valNow = nums[i];
            sum += valNow;
            if (sum < 0) {
                sum = 0;
            }
            if (sum > sumMax) {
                sumMax = sum;
            }
        }
        return sumMax;
    }

    public static void main(String[] args) {
        System.out.println(getMaxSum(new int[]{-2, 11, -4, 13, -5, -2}));
    }
}
