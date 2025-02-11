package leetcode.y2024.m10.d08.d14;

class Solution887 {
    public static void main(String[] args) {
        System.out.println(superEggDrop(2,100));
    }
    public static int superEggDrop(int k, int n) {
        int[] f = new int[k + 1];
        for (int i = 1; ; i++) {
            for (int j = k; j > 0; j--) {
                f[j] += f[j - 1] + 1;
            }
            if (f[k] >= n) {
                return i;
            }
        }
    }
}