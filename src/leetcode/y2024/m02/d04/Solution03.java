package leetcode.y2024.m02.d04;

import java.util.*;

class Solution03 {
    public int lengthOfLongestSubstring(String s) {

        int windowlength = 0;
        LinkedList<Character> list = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (list.contains(chars[i])) {
                while (true) {
                    Character character = list.removeFirst();
                    if (character.equals(chars[i])) {
                        i--;
                        break;
                    }
                }
            } else {
                list.add(chars[i]);
                windowlength = list.size() > windowlength ? list.size() : windowlength;
            }
        }
        return windowlength;
    }
}