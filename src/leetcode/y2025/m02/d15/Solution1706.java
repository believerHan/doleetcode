package leetcode.y2025.m02.d15;

class Solution1706 {

    public static void main(String[] args) {

    }

    public static int[] findBall(int[][] grid) {
        int n = grid[0].length;
        int[] ans = new int[n];
        for (int j = 0; j < n; j++) {
            // 模拟第 j 列球的移动
            int curCol = j; // 当前列号
            for (int[] row : grid) {
                int d = row[curCol]; // -1 或 1，表示左/右
                curCol += d; // 左/右走一步
                // 如果球出界或者卡在 V 形，退出循环，否则继续循环（垂直落入下一排）
                // V 形就是 -1 的左边是 1，1 的右边是 -1，即 row[curCol] != d
                if (curCol < 0 || curCol == n || row[curCol] != d) {
                    curCol = -1;
                    break;
                }
            }
            ans[j] = curCol;
        }
        return ans;
    }
}