package leetcode.y2025.m02.d27;

//2296
class TextEditorM2 {

    private final StringBuilder left = new StringBuilder(); // 光标左侧字符
    private final StringBuilder right = new StringBuilder(); // 光标右侧字符

    public void addText(String text) {
        left.append(text); // 入栈
    }

    public int deleteText(int k) {
        k = Math.min(k, left.length());
        left.setLength(left.length() - k); // 出栈
        return k;
    }

    public String cursorLeft(int k) {
        while (k > 0 && left.length()!=0) {
            right.append(left.charAt(left.length() - 1)); // 左手倒右手
            left.setLength(left.length() - 1);
            k--;
        }
        return text();
    }

    public String cursorRight(int k) {
        while (k > 0 && left.length()!=0) {
            left.append(right.charAt(right.length() - 1)); // 右手倒左手
            right.setLength(right.length() - 1);
            k--;
        }
        return text();
    }

    private String text() {
        // 光标左边至多 10 个字符
        return left.substring(Math.max(left.length() - 10, 0));
    }


}

/**
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */