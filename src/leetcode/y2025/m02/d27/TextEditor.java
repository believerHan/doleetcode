package leetcode.y2025.m02.d27;

//2296  模拟
class TextEditor {

    private StringBuilder sb;

    private int index = 0;

    public TextEditor() {
        sb = new StringBuilder();
    }

    public void addText(String text) {
        sb.insert(index, text);
        index += text.length();
    }

    public int deleteText(int k) {
        int start =index;
        int deleted = index < k ? 0 : index - k;
        sb.delete(deleted, index);
        index = deleted;
        return start < k ? start : k;
    }

    public String cursorLeft(int k) {
        index = index < k ? 0 : index - k;
        if (index <= 10)
            return sb.substring(0, index);
        return sb.substring(index - 10, index);
    }

    public String cursorRight(int k) {
        index = (k + index) > sb.length() ? sb.length() : index + k;
        if (index <= 10)
            return sb.substring(0, index);
        return sb.substring(index - 10, index);
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