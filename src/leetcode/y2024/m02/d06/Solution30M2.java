package leetcode.y2024.m02.d06;

import java.util.PriorityQueue;

class Solution30M2 {

    public static void main(String[] args) {
        System.out.println(magicTower(new int[]{5, -4, 1, -2, -2, -2, -2, -2, -4, 18}));
        // System.out.println(magicTower(new int[]{-200, -300, 400, 0}));
    }

    public static int magicTower(int[] nums) {
        long sum = 1;
        long delay = 0;
        int[] count = new int[100001];
        int v = 0;
        int steps = 0;
        for (int x : nums) {
            sum += x;
            if (x < 0) {
                ++count[-x];
                v = Math.max(v, -x);
                if (sum <= 0) {
                    //如果当前合小于0，则取出最小的补血。
                    while (count[v] == 0)
                        v--;
                    --count[v];
                    delay += v;
                    sum += v;
                    ++steps;
                }
            }
        }
        if (sum <= delay) {
            steps = -1;
        }
        return steps;
    }
}