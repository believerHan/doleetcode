package leetcode.y2025.m02.d20;

import java.util.Arrays;

class Solution2595M3 {
    public static void main(String[] args) {
        Arrays.stream(evenOddBit(5)).forEach(s->System.out.println(s));
    }
    //利用位掩码0x55555555（二进制0101⋯01），与n计算 AND，即可取出所有偶数下标比特，然后用库函数统计其中1的个数。
    //
    //把0x55555555左移一位（二进制1010⋯10），与n计算 AND，即可取出所有奇数下标比特，然后用库函数统计其中1的个数。

    public static int[] evenOddBit(int n) {
        final int MASK = 0x55555555;
        return new int[]{Integer.bitCount(n & MASK), Integer.bitCount(n & (MASK << 1))};
    }
}