package leetcode.y2024.m02.d04;

class Solution172 {
    public int countTarget(int[] scores, int target) {
        int left = 0, right = scores.length - 1;
        int first = -1, second = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (scores[mid] > target) {
                right = mid - 1;
            } else if (scores[mid] < target) {
                left = mid + 1;
            } else if (scores[mid] == target) {
                first = mid;
                right = mid - 1;
            }
        }
        if (first == -1) {
            return 0;
        }
        left = first;
        right = scores.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (scores[mid] > target) {
                right = mid - 1;
            } else if (scores[mid] < target) {
                left = mid + 1;
            } else if (scores[mid] == target) {
                second = mid;
                left = mid + 1;
            }
        }
        return second - first + 1;

    }
}