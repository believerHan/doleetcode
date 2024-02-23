package leetcode.y2024.m02.d05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Solution438M3 {

    public static void main(String[] args) {
        //  System.out.println(findAnagrams("baacdwadawwfaa", "aa"));
        //  System.out.println(findAnagrams("cbaebabacd", "abc"));
        System.out.println(findAnagrams("abacbabc", "abc"));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        List<Integer> res = new ArrayList<>();
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            need.put(p.charAt(i), need.getOrDefault(p.charAt(i), 0) + 1);
        }
        int valid = 0;
        for (int i = 0, j = 0; i < n; i++) {
            if (need.containsKey(s.charAt(i))) {
                window.put(s.charAt(i), window.getOrDefault(s.charAt(i), 0) + 1);
                if (window.get(s.charAt(i)).equals(need.get(s.charAt(i)))) {
                    valid++;
                }
            }
            while (i - j + 1 >= p.length()) {
                if (valid == need.size()) {
                    res.add(j);
                }
                if (need.containsKey(s.charAt(j))) {
                    if (window.get(s.charAt(j)).equals(need.get(s.charAt(j)))) {
                        valid--;
                    }
                    window.put(s.charAt(j), window.get(s.charAt(j)) - 1);
                }
                j++;
            }
        }
        return res;

    }
}