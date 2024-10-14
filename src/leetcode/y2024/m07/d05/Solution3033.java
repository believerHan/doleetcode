package leetcode.y2024.m07.d05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution3033 {
    public int[][] modifiedMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int max = matrix[0][i];
            List<Integer> rep = new ArrayList<>();
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == -1) {
                    rep.add(j);
                }
                max = Math.max(max, matrix[j][i]);
            }
            for (Integer index : rep) {
                matrix[index][i] = max;
            }
        }
        return matrix;
    }
}