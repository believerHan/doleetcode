package leetcode.y2025.m02.d17;

class Solution12878 {


    public static void main(String[] args) {
        System.out.println(findSpecialInteger(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 12, 12}));
        //  System.out.println(findSpecialInteger(new int[]{1, 2, 3, 5, 6, 7, 8, 9, 9, 9, 9}));
        // System.out.println(findSpecialInteger(new int[]{1, 2}));

    }

    public static int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int m = n / 4;
        for (int i = 0; i < n - m; i++) {
            if (arr[i] == arr[i+m]) {
                return arr[i];
            }
        }
        return 0;
    }
}