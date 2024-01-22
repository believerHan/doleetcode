package leetcode.y2024.m01.d18;

import java.util.LinkedList;
import java.util.List;

class Solution126 {
    static List<List<Integer>> allPossible = new LinkedList<>();
    static LinkedList<Integer> num = new LinkedList<>();

    public static void main(String[] args) {
        combinationSum3(3, 9);
        System.out.println(allPossible.toString());
    }

    // k  个数    n  总和
    public static List<List<Integer>> combinationSum3(int k, int n) {
        if (n / k < 1 || n > 45) {
            return allPossible;
        }
        comNum(k, n, 1, 0);
        return allPossible;
    }

    private static void comNum(int k, int n, int start, int sum) {

        if (num.size() == k) {
            if (sum == n) {
                allPossible.add(new LinkedList<>(num));
            }
            return;
        }
        for (int i = start; i <= 9; i++) {
            num.add(i);
            sum += i;
            comNum(k, n, i + 1, sum);
            num.removeLast();
            sum -= i;
        }
    }
}