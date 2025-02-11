package leetcode.y2024.m10.d08.d14;

class Solution1884 {
    public int twoEggDrop(int n) {
        return (int) Math.ceil(Math.sqrt(n * 8 + 1)) / 2;
    }
}