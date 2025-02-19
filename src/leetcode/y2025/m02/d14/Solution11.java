package leetcode.y2025.m02.d14;

class Solution11 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{6, 6, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            int curr = (right - left) * Math.min(height[left], height[right]);
            max = Math.max(curr, max);
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}