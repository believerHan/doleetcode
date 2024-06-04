package leetcode.y2024.m05.d31;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

class Solution2965 {
    public static void main(String[] args) {
        for (int missingAndRepeatedValue : findMissingAndRepeatedValues(new int[][]{{9, 1, 7}, {8, 9, 2}, {3, 4, 6}})) {
            System.out.println(missingAndRepeatedValue);
        }

        for (int missingAndRepeatedValue : findMissingAndRepeatedValues(new int[][]{{1,3}, {2,2}})) {
            System.out.println(missingAndRepeatedValue);
        }
    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length * grid.length;
        int sum = n * (n + 1) / 2;//和
        int sumSq = n * (n + 1) * (2 * n + 1) / 6;//平方和
        int d1 = sum;
        long d2 = sumSq;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                d1 = d1 - anInt;
                d2 = d2 - anInt * anInt;
            }
        }
        int d = (int) (d2 / d1);
        return new int[]{(d + d1) / 2, (d - d1) / 2};
    }
}