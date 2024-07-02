package leetcode.y2024.m07.d02;

class Solution121M2 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 6,10, 5, 3, 6, 4,8}));
    }

    public static int maxProfit(int[] prices) {
        int ans = 0;
        int minPrice = prices[0];
        for (int p : prices) {
            ans = Math.max(ans, p - minPrice);
            minPrice = Math.min(minPrice, p);
        }
        return ans;

    }

}