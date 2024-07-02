package leetcode.y2024.m07.d02;

class Solution121 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 6,10, 5, 3, 6, 4,8}));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        int incr = 0;
        for (int i = 1; i < prices.length; i++) {
            int cur = 0;
            cur = prices[i] - prices[i - 1];
            incr += cur;
            if (incr < 0) {
                 incr = 0 ;
            }
            max = incr > max ? incr : max;
        }
        return max ;
    }

}