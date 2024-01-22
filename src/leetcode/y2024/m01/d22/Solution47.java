package leetcode.y2024.m01.d22;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution47 {

    static List<List<Integer>> allPossible = new LinkedList<>();
    static LinkedList<Integer> allAdd = new LinkedList<>();

    public static void main(String[] args) {
        permuteUnique(new int[]{1,1,1,3});
        System.out.println(allPossible);
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {

        boolean[] numTag = new boolean[nums.length];
        Arrays.sort(nums);
        backTrace(nums, numTag);

        return allPossible;
    }

    private static void backTrace(int[] nums, boolean[] numTag) {

        if (allAdd.size() == nums.length) {
            allPossible.add(new LinkedList<>(allAdd));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (numTag[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i-1] && !numTag[i-1]){
                continue;
            }
            allAdd.add(nums[i]);
            numTag[i] = true;
            backTrace(nums, numTag);
            numTag[i] = false;
            allAdd.removeLast();
        }

    }
}