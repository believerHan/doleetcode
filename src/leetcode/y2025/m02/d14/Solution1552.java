package leetcode.y2025.m02.d14;

import java.util.Arrays;

class Solution1552 {
    public static void main(String[] args) {
        System.out.println(maxDistance(new int[]{5, 4, 3, 2, 1, 10}, 3));
    }

    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        //理论最大最小间隔。
        int r = (position[position.length - 1] - position[0]) / (m - 1);
        int l = 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            int n = position[0];
            int count = 0;
            for (int i = 1; i < position.length; i++) {
                if ((position[i] - n) >= mid) {
                    n = position[i];
                    count++;
                }
                if (count == m - 1) {
                    break;
                }
            }
            if (count == m - 1) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }
}