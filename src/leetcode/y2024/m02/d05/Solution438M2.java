package leetcode.y2024.m02.d05;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


class Solution438M2 {

    public static void main(String[] args) {
        //  System.out.println(findAnagrams("baacdwadawwfaa", "aa"));
        //  System.out.println(findAnagrams("cbaebabacd", "abc"));
        System.out.println(findAnagrams("abacbabc", "abc"));
    }

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new ArrayList<>();
        // 统计 p 中每个字母的个数
        int[] cnt = new int[26];
        for (int i = 0; i < p.length(); i++) {
            cnt[p.charAt(i) - 'a']++;
        }
        int l = 0, r = 0;
        //左右指针
        while (r < s.length()) {
            cnt[s.charAt(r) - 'a']--;
            while (cnt[s.charAt(r) - 'a'] < 0) {
                //说明存在不匹配的情况，需要进行cnt的恢复
                cnt[s.charAt(l) - 'a']++;
                l++;
            }
            if (r - l + 1 == p.length()) {
                //出现这种情况一定是完全匹配，不然就会出现cnt[]<0,l就会右移动，也就不等于m。
                res.add(l);
            }
            r++;
        }
        return res;
    }
}