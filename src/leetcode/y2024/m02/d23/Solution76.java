package leetcode.y2024.m02.d23;

class Solution76 {

    public static void main(String[] args) {
        System.out.println(minWindow("cabwefgewcwaefgcf", "cae"));
    }

    public static String minWindow(String s, String t) {

        int sLen = s.length(), tLen = t.length();
        if (tLen > sLen) {
            return "";
        }
        int minlength = sLen + 1;
        int starl = 0;
        int[] tcnt = new int[88];
        int num = 0;
        for (int i = 0; i < tLen; i++) {
            tcnt[t.charAt(i) - 'A']++;
            if (tcnt[t.charAt(i) - 'A'] == 1) {
                num++;
            }
        }
        int l = 0, r = 0;
        while (r < sLen) {
            tcnt[s.charAt(r) - 'A']--;
            if (tcnt[s.charAt(r) - 'A'] == 0) {
                num--;
            }
            while (num == 0) {
                if (r - l + 1 < minlength) {
                    minlength = r - l + 1;
                    starl = l;
                }
                //左指针右移动
                if (++tcnt[s.charAt(l) - 'A'] > 0) {
                    num++;
                }
                l++;
            }
            r++;
        }
        if (minlength == sLen + 1) {
            return "";
        }
        return s.substring(starl, starl + minlength);
    }
}