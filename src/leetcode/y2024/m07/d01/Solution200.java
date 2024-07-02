package leetcode.y2024.m07.d01;

import java.util.HashMap;

class Solution200 {

    static int num = 0;

    public static void main(String[] args) {

    }

    public static int numIslands(char[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    num++;
                    findIsland(i, j, grid);
                }
            }
        }
        return num;
    }

    private static void findIsland(int i, int j, char[][] grid) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0' || grid[i][j] == '2') return ;

        if (grid[i][j] == '1') {
            grid[i][j] = '2';
        }

        findIsland(i-1, j, grid);
        findIsland(i+1, j, grid);
        findIsland(i, j-1, grid);
        findIsland(i, j+1, grid);
    }


}