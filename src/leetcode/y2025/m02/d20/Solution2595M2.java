package leetcode.y2025.m02.d20;

import java.util.Arrays;

class Solution2595M2 {
    public static void main(String[] args) {
        Arrays.stream(evenOddBit(5)).forEach(s->System.out.println(s));
    }

    public static int[] evenOddBit(int n) {
        int[] ans=new int[2];
        for(int i=0;n>0;n>>=1){
            ans[i]+=n&1;
            i^=1;
        }
        return ans;
    }
}