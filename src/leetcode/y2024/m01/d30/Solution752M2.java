package leetcode.y2024.m01.d30;

import java.util.*;

class Solution752M2 {

    public static void main(String[] args) {
        int i = openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202");
        System.out.println(i);
    }

    //双向BFS
    public static int openLock(String[] deadends, String target) {
        HashSet<String> deads = new HashSet<>();
        deads.addAll(Arrays.asList(deadends));
        //0000 当前层
        HashSet<String> startWorkEnd = new HashSet<>();
        startWorkEnd.add("0000");
        //target 当前层
        HashSet<String> targetWorkEnd = new HashSet<>();
        targetWorkEnd.add(target);
        //存放走过的路
        int num = 0;
        while (!startWorkEnd.isEmpty() && !targetWorkEnd.isEmpty()) {
            //转动结果
            HashSet<String> curlevel;
            //每次选取最小数量的节点
            if (startWorkEnd.size() > targetWorkEnd.size()) {
                curlevel = startWorkEnd;
                startWorkEnd = targetWorkEnd;
                targetWorkEnd = curlevel;
            }
            curlevel = new HashSet<>();
            for (String s : startWorkEnd) {
                //当 两个层有重叠的时候，就是有正确值
                if (targetWorkEnd.contains(s)) {
                    return num;
                }
                //如果是dead，就跳过
                if (deads.contains(s)) {
                    continue;
                }
                deads.add(s);
                //转一下
                char[] chars = s.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    char originalChar = chars[i];
                    // Increment
                    chars[i] = (originalChar == '9') ? '0' : (char) (originalChar + 1);
                    //
                    if (!deads.contains(chars)) {
                        curlevel.add(new String(chars));
                    }
                    // Decrement
                    chars[i] = (originalChar == '0') ? '9' : (char) (originalChar - 1);
                    if (!deads.contains(chars)) {
                        curlevel.add(new String(chars));
                    }
                    // Restore original char for next iteration
                    chars[i] = originalChar;
                }
            }
            startWorkEnd = targetWorkEnd;
            targetWorkEnd = curlevel;
            num++;

        }

        return -1;
    }


}