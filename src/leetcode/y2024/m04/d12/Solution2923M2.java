package leetcode.y2024.m04.d12;

class Solution2923M2 {

    public static void main(String[] args) {
        System.out.println(findChampion(
                new int[][]{
                        {0, 0},
                        {1, 0}

                }
        ));
    }


    public static int findChampion(int[][] grid) {
        int ans = 0;
        for (int i = 1; i < grid.length; i++) {
            if (grid[i][ans] == 1) {
                ans = i;
            }
        }
        return ans;
    }

}