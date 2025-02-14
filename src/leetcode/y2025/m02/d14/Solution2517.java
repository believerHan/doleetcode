package leetcode.y2025.m02.d14;

import java.util.Arrays;

class Solution2517 {
    public static void main(String[] args) {
        System.out.println(maximumTastiness(new int[]{1,1,1,1,1,1}, 3));
    }

    public static int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        //理论最大最小间隔。
        int r = (price[price.length - 1] - price[0]) / (k - 1);
        int l = 0;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            int n = price[0];
            int count = 0;
            for (int i = 1; i < price.length; i++) {
                if ((price[i] - n) >= mid) {
                    n = price[i];
                    count++;
                }
                if (count == k - 1) {
                    break;
                }
            }
            if (count == k - 1) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }
}