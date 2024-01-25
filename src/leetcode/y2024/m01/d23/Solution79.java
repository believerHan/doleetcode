package leetcode.y2024.m01.d23;

import java.util.LinkedList;
import java.util.List;

class Solution79 {

    static List<List<Integer>> allComb = new LinkedList<>();
    static LinkedList<Integer> curComb = new LinkedList<>();

    public static void main(String[] args) {
        subsets(new int[]{1,2,3});
        System.out.println(allComb);
    }
    public static List<List<Integer>> subsets(int[] nums) {

        for (int i = 0; i <= nums.length; i++) {
            backtrace(nums,i,0);
        }
        return allComb;
    }

    private static void backtrace(int[] nums,int chooseNum,int start) {

        if(curComb.size()==chooseNum){
            allComb.add(new LinkedList<>(curComb));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            curComb.add(nums[i]);
            backtrace(nums,chooseNum,i+1);
            curComb.removeLast();
        }
    }
}