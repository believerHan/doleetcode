package leetcode.y2024.m01.d22;

import java.util.LinkedList;
import java.util.List;

class Solution77 {

    static List<List<Integer>> allComb = new LinkedList<>();
    static LinkedList<Integer> curComb = new LinkedList<>();

    public static void main(String[] args) {
        combine(4, 2);
        System.out.println(allComb);
    }

    public static List<List<Integer>> combine(int n, int k) {

        backtrace(n, k, 1);

        return allComb;
    }

    private static void backtrace(int n, int k, int i) {
        if (curComb.size() == k) {
            allComb.add(new LinkedList<>(curComb));
        }
        for (int j = i; j <= n; j++) {
            curComb.add(j);
            backtrace(n, k, j + 1);
            curComb.removeLast();
        }

    }
}