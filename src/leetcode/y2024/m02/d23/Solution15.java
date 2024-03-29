package leetcode.y2024.m02.d23;

import java.util.*;
import java.util.stream.Collectors;

class Solution15 {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 0}));
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        //   System.out.println(threeSum(new int[]{0,1,1}));
        //  System.out.println(threeSum(new int[]{1,2,-2,-1}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        //Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int a = i + 1;
            int b = nums.length - 1;
            while (a <= b) {
                if (map.containsKey(-nums[i] - nums[a])) {
                    if (map.get(-nums[i] - nums[a]) >= a ) {
                        List<Integer> s = new ArrayList<>();
                        s.add(nums[a]);
                        s.add(-nums[i] - nums[a]);
                        s.add(nums[i]);
                        lists.add(s);
                    }
                }
                if (map.containsKey(-nums[i] - nums[b])) {
                    if (map.get(-nums[i] - nums[b]) > i && map.get(-nums[i] - nums[b]) < b) {
                        List<Integer> s = new ArrayList<>();
                        s.add(-nums[i] - nums[b]);
                        s.add(nums[b]);
                        s.add(nums[i]);
                        lists.add(s);
                    }
                }
                a++;
                b--;
            }
        }
        lists = lists.stream().distinct().collect(Collectors.toList());
        return lists;
    }
}