package leetcode.y2025.m05.d05;

class Solution1328 {
    public static void main(String[] args) {
        System.out.println(breakPalindrome("aaaa"));
    }

    public static String breakPalindrome(String palindrome) {
        int mid = palindrome.length() / 2;
        char[] charArray = palindrome.toCharArray();
        if(palindrome.length()<2){
            return "";
        }
        for (int i = 0; i < mid; i++) {
            if (charArray[i] != 'a') {
                charArray[i] = 'a';
                return new String(charArray);
            }
        }
        charArray[palindrome.length()-1]='b';
        return new String(charArray);
    }
}