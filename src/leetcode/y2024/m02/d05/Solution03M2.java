package leetcode.y2024.m02.d05;

import java.util.*;

/**
 * 左右指针
 */
class Solution03M2 {

    public static void main(String[] args) {

       // System.out.println(lengthOfLongestSubstring("aabaab!bb"));
        //System.out.println(lengthOfLongestSubstring("tmmzuxt"));
        //System.out.println(lengthOfLongestSubstring("AB"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));

    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int windowlength = 0;
        int left = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (hashMap.containsKey(chars[i])) {
                //更新 左指针
                left = hashMap.get(chars[i]) + 1 > left ? hashMap.get(chars[i]) + 1 : left;
                hashMap.put(chars[i],i);
            } else {
                hashMap.put(chars[i], i);

            }
            windowlength = i - left + 1> windowlength ? i - left + 1 : windowlength;
        }
        return windowlength;
    }

}