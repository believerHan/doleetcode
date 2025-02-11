package leetcode.y2025.m02.d09;

class Solution80 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,2,2,2,2,3}));
    }
    public static int removeDuplicates(int[] nums) {
        int start = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[start - 2]) {
                nums[start++] = nums[i];
            }
        }
        return Math.min(start, nums.length);
    }
}