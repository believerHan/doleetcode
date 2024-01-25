package leetcode.y2024.m01.d23;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution90 {

    static List<List<Integer>> allPossible = new LinkedList<>();
    static LinkedList<Integer> curNum = new LinkedList<>();

    public static void main(String[] args) {
        subsetsWithDup(new int[]{1, 2, 2, 2, 2});
        System.out.println(allPossible);
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length; i++) {
            backtrace(nums, i, 0);
        }
        return allPossible;
    }

    private static void backtrace(int[] nums, int length, int stat) {

        if (curNum.size() == length) {
            allPossible.add(new LinkedList<>(curNum));
            return;
        }
        //
        for (int i = stat; i < nums.length - (length - curNum.size()) + 1; i++) {

            if (i > stat && nums[i] == nums[i - 1]) {
                continue;
            }
            curNum.add(nums[i]);
            backtrace(nums, length, i + 1);
            curNum.removeLast();
        }
    }
}