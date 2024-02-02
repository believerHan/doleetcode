package leetcode.y2024.m01.d31;

import java.util.Arrays;

class Solution34 {
    public static void main(String[] args) {
        int[] ints = searchRange(new int[]{1, 2, 3, 4, 5, 6, 6, 6, 8, 9, 10}, 6);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int j = nums.length - 1;
        int i = 0;

        if (nums[j] == target) {
            int left = j;
            while (nums[left] == target && left >= 0) {
                left--;
            }
            return new int[]{++left, j};

        }
        while (j >= i) {
            int mid = (j - i) / 2;
            if (nums[mid] == target) {
                int left = mid, right = mid;
                while (nums[--left] == target && left >= 0) {
                }
                while (nums[++right] == target && right <= nums.length - 1) {
                }
                return new int[]{++left, --right};
            }
            if (nums[mid] < target) {
                i = mid;
            } else {
                j = mid;
            }
        }
        return new int[]{-1, -1};


    }
}