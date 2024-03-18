package leetcode.y2024.m03.d18;

class Solution28 {


    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issip"));
    }

    public static int strStr(String haystack, String needle) {
        for (int i = 0; i <= (haystack.length() - needle.length()); i++) {
            boolean flag = true;
            for (int j = 0; j <= needle.length() - 1; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    i = i + j;
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }
}