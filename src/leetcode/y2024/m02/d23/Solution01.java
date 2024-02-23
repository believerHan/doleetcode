package leetcode.y2024.m02.d23;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution01 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                Integer last = hashMap.get(target - nums[i]);
                if (last != i) {
                    return new int[]{last, i};
                }
            }
        }
        return new int[]{};
    }
}