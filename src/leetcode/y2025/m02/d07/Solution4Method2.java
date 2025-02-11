package leetcode.y2025.m02.d07;

class Solution4Method2 {

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{2, 3, 4, 5}, new int[]{1, 3, 5, 6, 7, 8, 9}));
    }

    //时间复杂度为 O(Log(MIN(m,n)))
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int mid = (m + n + 1) / 2;
        int l = 0, r = m;
        while (l < r) {
            int mid1 = l + (r - l + 1) / 2;
            int mid2 = mid - mid1;
            if (nums1[mid1 - 1] > nums2[mid2]) {
                //数组1分割的左边 大于 数组2的右边 左移 下次搜索为 [l,mid1]
                r = mid1 - 1;
            } else {
                l = mid1;
            }
        }
        int m1 = l;
        int m2 = mid - l;
        int m1LeftMax = m1 == 0 ? Integer.MIN_VALUE : nums1[m1 - 1];
        int m1RightMin = m1 == m ? Integer.MAX_VALUE : nums1[m1];
        int m2LeftMax = m2 == 0 ? Integer.MIN_VALUE : nums2[m2-1];
        int m2RightMin = m2 == n ? Integer.MAX_VALUE : nums2[m2];
        if (((m + n) & 1) == 0) {
            return (Math.max(m1LeftMax, m2LeftMax) + Math.min(m1RightMin, m2RightMin)) * 0.5;
        }
        return Math.max(m1LeftMax, m2LeftMax);
    }
}