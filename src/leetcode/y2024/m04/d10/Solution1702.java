package leetcode.y2024.m04.d10;

class Solution1702 {
    public static void main(String[] args) {
        System.out.println(maximumBinaryString("000110"));
    }
    public static String maximumBinaryString(String binary) {
        int i = binary.indexOf('0');
        if (i < 0) { // binary 全是 '1'
            return binary;
        }
        char[] s = binary.toCharArray();
        int cnt1 = 0;
        for (i++; i < s.length; i++) {
            cnt1 += s[i] - '0'; // 统计 [i, n-1] 中 '1' 的个数
        }
        char[] chars = binary.replace('0', '1').toCharArray();
        chars[s.length - 1 - cnt1] = '0';
        return new String(chars);

    }
}