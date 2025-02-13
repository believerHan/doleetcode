package leetcode.y2025.m02.d12;

import java.util.Arrays;

class Solution1760 {
    public static void main(String[] args) {
        System.out.println(minimumSize(new int[]{7, 4, 8, 2}, 4));
    }
    //
    public static int minimumSize(int[] nums, int maxOperations) {
        // total 是所有球的总和
        long total = 0;
        for (int num : nums) {
            total += num;
        }
        // l 是最小球数的下界，保证有足够的空间来分配球
        long l = Math.max(1, total / (nums.length + maxOperations));
        // r 是最大球数的上界，均匀划分
        long r = total / maxOperations;
        // 二分
        while (l < r) {
            long mid = (l + r) / 2;
            long operationsNeeded = 0;  // 记录需要的操作次数
            // 计算每个物品需要多少操作才能不超过当前的球数
            for (int num : nums) {
                operationsNeeded += (num - 1) / mid;
            }
            if (operationsNeeded <= maxOperations) {  // 合理
                r = mid;
            } else {  // 超过
                l = mid + 1;
            }
        }
        return (int)l;  // 返回找到的最小球数
    }
}