package leetcode.y2024.m03.d13;

class Solution2789 {
    public static void main(String[] args) {
        System.out.println(maxArrayValue(new int[]{2,3,7,9,3}));
    }
    public static long maxArrayValue(int[] nums) {
        long max = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            if (max > nums[i - 1]) {
                max = max + nums[i - 1];
            } else {
                max = nums[i - 1];
            }
        }
        return max;
    }
}