package leetcode.y2024.m01.d24;

import java.math.BigInteger;

class Solution2470 {

    public static void main(String[] args) {
       // int i = subarrayLCM(new int[]{2, 3, 6, 3, 2}, 6);
        int gcd = gcd(12, 18);
        System.out.println(gcd);

    }

    public static int subarrayLCM(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int dp = nums[i];

            for (int j = i; j < n; j++) {
                dp = lcm(dp, nums[j]);

                if (dp == k) {
                    ans++;
                } else if (dp > k) {
                    break;
                }
            }
        }

        return ans;
    }

    private static int lcm(int a, int b) {
        // 计算最大公约数
        int gcd = gcd(a, b);

        // 计算最小公倍数
        return (a / gcd) * b;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}