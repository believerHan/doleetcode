package leetcode.y2025.m02.d13;

import java.util.Arrays;

class Solution1742 {
    public static void main(String[] args) {
        System.out.println(countBalls(1,1000));
    }
    public static int countBalls(int lowLimit, int highLimit) {
        int[] s = new int[54];
        for (int i = lowLimit; i <= highLimit; i++) {
            int n = 0,cur = i;
            while (cur > 0) {
                int m = cur % 10;
                n += m;
                cur = (cur - m) / 10;
            }
            s[n]++;
        }
        return Arrays.stream(s).max().getAsInt();
    }
}