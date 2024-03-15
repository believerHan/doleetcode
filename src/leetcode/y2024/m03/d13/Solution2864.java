package leetcode.y2024.m03.d13;

class Solution2864 {
    public String maximumOddBinaryNumber(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                num++;
            }
        }
        StringBuilder app = new StringBuilder();
        for (int i = 0; i < num - 1; i++) {
            app.append(1);
        }
        for (int i = 0; i < s.length() - num; i++) {
            app.append(0);
        }
        return app.append(1).toString();
    }
}