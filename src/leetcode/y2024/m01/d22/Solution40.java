package leetcode.y2024.m01.d22;

import java.util.*;

class Solution40 {

    static LinkedList<List<Integer>> allPossible = new LinkedList<>();
    static LinkedList<Integer> allAdd = new LinkedList<>();

    public static void main(String[] args) {
        combinationSum2(new int[]{1, 2, 2, 2, 5}, 5);
        System.out.println(allPossible);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTrace(candidates, target, 0, 0);
        return allPossible;
    }

    private static void backTrace(int[] candidates, int target, int start, int sum) {
        if (sum == target) {
            allPossible.add(new LinkedList<>(allAdd));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            sum += candidates[i];
            if (sum > target) {
                break;
            }
            if (i > start && (candidates[i] == candidates[i - 1])) {
                sum -= candidates[i];
                continue;
            }
            allAdd.add(candidates[i]);
            backTrace(candidates, target, i + 1, sum);
            allAdd.removeLast();
            sum -= candidates[i];
        }
    }
}