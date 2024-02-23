package leetcode.y2024.m02.d23;

import java.util.Arrays;
import java.util.HashMap;

class Solution01M2 {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        int l = 0, r = nums.length - 1;
        while (l < r) {
            if (nums[l] + nums[r]>target){
                r--;
            }else if(nums[l] + nums[r]<target){
                l++;
            }else {
                return new int[] { hashMap.get(r), hashMap.get(l) };
            }
        }
        return new int[]{};
    }
}