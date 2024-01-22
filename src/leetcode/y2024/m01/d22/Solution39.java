package leetcode.y2024.m01.d22;

import java.util.LinkedList;
import java.util.List;

class Solution39 {

    static List<List<Integer>> allPossible = new LinkedList<>();
    static LinkedList<Integer> allAdd = new LinkedList<>();

    public static void main(String[] args) {
        combinationSum(new int[]{8,7,4,3},11);
        System.out.println(allPossible);
    }
    public static  List<List<Integer>> combinationSum(int[] candidates, int target) {
        pb(candidates, target, 0,0);
        return allPossible;
    }

    private static  void pb(int[] candidates, int target, int addend,int index) {

        if (addend == target) {
            allPossible.add(new LinkedList<>(allAdd));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            addend = addend + candidates[i];
            if (addend > target) {
                addend = addend - candidates[i];
                continue;
            }
            allAdd.add(candidates[i]);
            pb(candidates,target,addend,i);
            allAdd.removeLast();
            addend = addend - candidates[i];
        }

    }
}