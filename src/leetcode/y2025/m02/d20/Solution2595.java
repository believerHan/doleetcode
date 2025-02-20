package leetcode.y2025.m02.d20;

import java.util.Arrays;

class Solution2595 {
    public static void main(String[] args) {
        Arrays.stream(evenOddBit(5)).forEach(s->System.out.println(s));
    }

    public static int[] evenOddBit(int n) {
        int start = 0;
        int even = 0, odd = 0;
        for (int i = 10; i >= 0; i--) {
            int bit = (n >> i) & 1;
            if (bit == 1) {
                if (start % 2 == 0) {
                    odd++;
                } else {
                    even++;
                }
            }
            if (even != 0 || odd != 0) {
                start++;
            }
        }
        if (start % 2 == 0) {
            return new int[]{even, odd};
        }
        return new int[]{odd, even};
    }
}