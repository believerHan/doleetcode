package leetcode.y2024.m02.d01;

import java.util.Arrays;

/**
 * 由于第一种方法时间复杂度最坏为 O（log n）.优化如下
 * 寻找第一个小于 target，和第一个 大于 target的 值。
 */
class Solution34M2 {
    public static void main(String[] args) {
        int[] ints = searchRange(new int[]{6, 6, 6, 6, 6, 6, 6, 6, 8, 9, 10}, 6);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int left = findLeftBound(nums, target);
        int right = findRightBound(nums, target);

        return new int[]{left, right};
    }

    private static int findLeftBound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return (nums[left] == target) ? left : -1;
    }

    private static int findRightBound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            // 加1是为了防止死循环
            int mid = left + (right - left) / 2 + 1;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }

        return (nums[left] == target) ? left : -1;
    }

}