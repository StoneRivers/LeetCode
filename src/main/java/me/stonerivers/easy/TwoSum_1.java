package me.stonerivers.easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode-cn.com/problems/two-sum/description/
 * Created by ZhangYuanan on 2018/5/1.
 */
public class TwoSum_1 {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer other = sumMap.get(target - nums[i]);
            if (other != null) {
                result[0] = other;
                result[1] = i;
                return result;
            }
            sumMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] all = {2, 7, 11, 15};
        int sum = 9;
        TwoSum_1 twoSum = new TwoSum_1();
        int[] ints = twoSum.twoSum(all, sum);
        System.out.println(Arrays.toString(ints));
    }
}
