package leetcode.y2025.m02.d12;

import java.util.Arrays;

class Solution1761 {
    public static void main(String[] args) {
        System.out.println(minimumSize(new int[]{7, 4, 8, 2}, 4));
    }

    public static int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = Arrays.stream(nums).max().getAsInt();
        int n = 0;
        while (left <= right) {
            int m = right + (left - right) / 2;
            int ops = 0;
            for (int num : nums) {
                ops += (num - 1) / m;
            }
            if (ops <= maxOperations) {
                n = m;
                right = m - 1;
            } else {
                left = m + 1;
            }
        }
        return n;
    }
}