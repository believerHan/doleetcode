package leetcode.y2024.m01.d31;

class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int j = nums.length;
        for (int i = 0; i < j; i++) {
            int mid = (i + j) / 2;
            if (nums[mid] > target) {

            }
        }
        return null;
    }
}