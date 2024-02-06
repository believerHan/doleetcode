package leetcode.y2024.m02.d05;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 超出时间限制
 */
class Solution438 {

    public static void main(String[] args) {
      //  System.out.println(findAnagrams("baacdwadawwfaa", "aa"));
      //  System.out.println(findAnagrams("cbaebabacd", "abc"));
        System.out.println(findAnagrams("abacbabc", "abc"));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new LinkedList<>();
        Map<Character, Integer> charCountMap = p.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length-p.length()+1; i++) {
            int win = 0;
            Map<Character, Integer> map = new HashMap<>(charCountMap);
            for (int j = i; j < chars.length; j++) {
                if (map.containsKey(chars[j])) {
                    if (map.get(chars[j]) - 1 >= 0) {
                        map.put(chars[j],map.get(chars[j])-1);
                        win++;
                        if (win == p.length()) {
                            list.add(j - p.length() + 1);
                            win = 0;
                            break;
                        }
                    } else {
                        win = 0;
                     //   i = --j;
                        break;
                    }
                } else {
                    win = 0;
                    i = j;
                    break;
                }
            }
        }
        return list;
    }
}