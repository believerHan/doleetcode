package leetcode.y2024.m05.d30;

import java.util.*;

class Solution2982 {
    public static void main(String[] args) {
        System.out.println(maximumLength(""));
    }

    public static int maximumLength(String s) {
        char[] sc = s.toCharArray();
        List<Integer>[] groups = new ArrayList[26];
        Arrays.setAll(groups, i -> new ArrayList<>());
        int cnt = 0;
        for (int i = 0; i < sc.length; i++) {
            cnt++;
            if (i + 1 == sc.length || sc[i] != sc[i + 1]) {
                groups[sc[i] - 'a'].add(cnt); // 统计连续字符长度
                cnt = 0;
            }
        }
        int ans = 0;
        for (List<Integer> a : groups) {
            if (a.isEmpty())
                continue;
            a.sort(Collections.reverseOrder());
            a.add(0);
            a.add(0); // 假设还有两个空串
            ans = Math.max(ans, Math.max(a.get(0) - 2, Math.max(Math.min(a.get(0) - 1, a.get(1)), a.get(2))));
        }
        return ans > 0 ? ans : -1;
    }
}