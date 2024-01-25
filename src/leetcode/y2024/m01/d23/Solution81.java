package leetcode.y2024.m01.d23;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution81 {

    static List<List<Integer>> allComb = new LinkedList<>();
    static LinkedList<Integer> curComb = new LinkedList<>();

    public static void main(String[] args) {
        combinationSum(new int[]{2, 3, 5}, 8);
        System.out.println(allComb);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrace(candidates, target,0);
        return allComb;
    }

    private static void backtrace(int[] candidates, int target,int start) {

        if (target == 0) {
            allComb.add(new LinkedList<>(curComb));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (target - candidates[i] < 0) {
                return;
            }
            target -= candidates[i];
            curComb.add(candidates[i]);
            backtrace(candidates, target,i);
            curComb.removeLast();
            target += candidates[i];

        }
    }
}