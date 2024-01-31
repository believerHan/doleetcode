package leetcode.y2024.m01.d25;

import java.util.*;
import java.util.stream.Collectors;

class Solution752 {

    public static void main(String[] args) {
        int i = openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202");
        System.out.println(i);
    }

    public static int openLock(String[] deadends, String target) {
        if ("0000".equals(target)) {
            return 0;
        }
        //思路 BFS 从0000开始每走一步，有8个情况，将所有情况放到队列，如果出现的情况为死锁，则排除，，出现结果则直接跳出，否则放到下次轮询。
        Set<String> deads = Arrays.stream(deadends).collect(Collectors.toSet());
        LinkedList<String> curLevelValues = new LinkedList<>();
        curLevelValues.add("0000");
        int num = 0;
        while (!curLevelValues.isEmpty()) {
            //开始转动一步
            num++;
            int size = curLevelValues.size();
            for (int i = 0; i < size; i++) {
                String curValue = curLevelValues.removeFirst();
                if (deads.contains(curValue)) {
                    continue;
                }
                List<String> strings = turnLock(curValue);
                //判断当前转动的值中是否存在结果值
                if (strings.contains(target)) {
                    return num;
                }
                curLevelValues.addAll(strings);
                //当前值放在 deads
                deads.add(curValue);
            }
        }
        return -1;
    }

    public static List<String> turnLock(String input) {
        List<String> permutations = new ArrayList<>();
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char originalChar = chars[i];

            // Increment
            chars[i] = (originalChar == '9') ? '0' : (char) (originalChar + 1);
            permutations.add(new String(chars));

            // Decrement
            chars[i] = (originalChar == '0') ? '9' : (char) (originalChar - 1);
            permutations.add(new String(chars));

            // Restore original char for next iteration
            chars[i] = originalChar;
        }

        return permutations;
    }


}