package leetcode.y2024.m04.d12;

import java.util.ArrayList;
import java.util.List;

class Solution2923 {

    public static void main(String[] args) {
        System.out.println(findChampion(
                new int[][]{
                        {0, 0},
                        {1, 0}

                }
        ));
    }

    public static int findChampion(int[][] grid) {
        int length = grid.length;
        boolean[] fail = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (fail[i] == false) {
                for (int j = 0; j < length; j++) {
                    if (i == j) continue;
                    if (grid[i][j] == 0) {
                        fail[i] = true;
                        break;
                    } else {
                        fail[j] = true;
                    }
                    if (j == length - 1 && fail[i] == false) {
                        return i;
                    }
                }
            }
        }

        return length-1;
    }
}