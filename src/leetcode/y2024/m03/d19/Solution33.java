package leetcode.y2024.m03.d19;

class Solution33 {

    public static void main(String[] args) {
        int search = search(new int[]{4, 5, 6, 7, 0, 1, 2}, 5);
        int search1 = search(new int[]{4, 5, 6, 7, 0, 1, 2}, 6);
        int search2 = search(new int[]{4, 5, 6, 7, 0, 1, 2}, 7);
        int search3 = search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        int search4 = search(new int[]{4, 5, 6, 7, 0, 1, 2}, 1);
        int search5 = search(new int[]{4, 5, 6, 7, 8, 1, 2, 3}, 5);
        int search6 = search(new int[]{4, 5, 6, 7, 8, 1, 2, 3}, 6);
        int search7 = search(new int[]{4, 5, 6, 7, 8, 1, 2, 3}, 7);
        int search8 = search(new int[]{4, 5, 6, 7, 8, 1, 2, 3}, 8);
        int search9 = search(new int[]{4, 5, 6, 7, 8, 1, 2, 3}, 1);
        int searcha = search(new int[]{7, 8, 1, 2, 3, 4, 5, 6}, 8);
        int searchb = search(new int[]{7, 8, 1, 2, 3, 4, 5, 6}, 1);
        int searchc = search(new int[]{7, 8, 1, 2, 3, 4, 5, 6}, 2);
        int searchd = search(new int[]{7, 8, 1, 2, 3, 4, 5, 6}, 3);
        int searche = search(new int[]{7, 8, 1, 2, 3, 4, 5, 6}, 4);
        System.out.println(search);
        System.out.println(search1);
        System.out.println(search2);
        System.out.println(search3);
        System.out.println(search4);
        System.out.println(search5);
        System.out.println(search6);
        System.out.println(search7);
        System.out.println(search8);
        System.out.println(search9);
        System.out.println(searcha);
        System.out.println(searchb);
        System.out.println(searchc);
        System.out.println(searchd);
        System.out.println(searche);
    }

    public static int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        if (target < nums[0] && target > nums[r]) {
            return -1;
        }
        if (target == nums[l]) {
            return l;
        }
        if (target == nums[r]) {
            return r;
        }
        while (l < r - 1) {
            int m = (l + r) / 2;
            if (target == nums[m]) {
                return m;
            }
            if (target > nums[m]) {
                if (target > nums[r] && nums[m] < nums[l]) {
                    r = m;
                } else {
                    l = m;
                }
            } else {
                if (target < nums[l] && nums[m] > nums[r]) {
                    l = m;
                } else {
                    r = m;
                }
            }
        }
        return -1;

    }
}