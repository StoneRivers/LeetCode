package me.stonerivers.leetcode.middle;

import java.util.HashMap;

/**
 * @author Zhangyuanan
 * @version 1.0
 * @since 2018/10/8
 */
public class LongestSubstringWithoutRepeatingCharacters_3 {


    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }

        HashMap<Character, Integer> indexMap = new HashMap<Character, Integer>();
        int start = 0;
        int maxLength = 0;
        int lengthNow = 0;
        for (int i = 0; i < s.length(); i++) {
            char charNow = s.charAt(i);
            if (indexMap.containsKey(charNow)) {
                Integer integer = indexMap.get(charNow);
                if (integer >= start) {
                    lengthNow = lengthNow - (integer - start + 1);
                    start = integer + 1;
                }
            }
            lengthNow++;

            if (lengthNow > maxLength) {
                maxLength = lengthNow;
            }
            indexMap.put(charNow, i);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters_3 lswrc_3 = new LongestSubstringWithoutRepeatingCharacters_3();
        System.out.println(lswrc_3.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lswrc_3.lengthOfLongestSubstring("bbbbb"));
        System.out.println(lswrc_3.lengthOfLongestSubstring("pwwkew"));
        System.out.println(lswrc_3.lengthOfLongestSubstring("tmmzuxt"));
    }

}
