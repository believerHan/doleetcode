package leetcode.y2024.m04.d09;

class Solution2529 {

    public static void main(String[] args) {
        System.out.println(maximumCount(new int[]{-3,-2,-1,0,0,1,2}));
    }

    public static int maximumCount(int[] nums) {
        int n = binarySearch(nums, 0);
        int p = binarySearch(nums, 1);
        return Math.max(n, nums.length - p);
    }

    public static  int binarySearch(int[] nums, int val) {
        int l = 0, r = nums.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] >= val) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}