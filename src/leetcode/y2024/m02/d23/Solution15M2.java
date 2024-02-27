package leetcode.y2024.m02.d23;

import java.util.*;
import java.util.stream.Collectors;

class Solution15M2 {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 0}));
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        //   System.out.println(threeSum(new int[]{0,1,1}));
        //  System.out.println(threeSum(new int[]{1,2,-2,-1}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        if ((nums[0]) > 0) {
            return lists;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> s = new ArrayList<>();
                    s.add(nums[i]);
                    s.add(nums[left]);
                    s.add(nums[right]);
                    lists.add(s);
                    while (left < right && nums[left] == nums[++left]) {
                    }
                    while (left < right && nums[right] == nums[--right]) {
                    }
                } else if (sum > 0) {
                    while (left < right && nums[right] == nums[--right]) {
                    }
                } else if (sum < 0) {
                    while (left < right && nums[left] == nums[++left]) {
                    }
                }
            }
        }
        return lists;
    }
}