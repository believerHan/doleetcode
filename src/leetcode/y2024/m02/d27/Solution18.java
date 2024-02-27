package leetcode.y2024.m02.d27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution18 {
    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{1000000000,1000000000,1000000000,1000000000},-294967296));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return lists;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int l = j + 1, r = nums.length - 1;
                while (l < r) {
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[l] + (long)nums[r];
                    if (sum == target) {
                        List<Integer> s = new ArrayList<>();
                        s.add(nums[i]);
                        s.add(nums[j]);
                        s.add(nums[l]);
                        s.add(nums[r]);
                        lists.add(s);
                        while (l < r && nums[r] == nums[--r]) {
                        }
                        while (l < r && nums[l] == nums[++l]) {
                        }
                    }
                    if (sum > target) {
                        r--;
                    }
                    if (sum < target) {
                        l++;
                    }
                }
            }
        }
        return lists;
    }
}