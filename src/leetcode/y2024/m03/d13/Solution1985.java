package leetcode.y2024.m03.d13;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

class Solution1985 {
    public static void main(String[] args) {
        System.out.println(kthLargestNumber(new String[]{"3", "6", "7", "10", "100"}, 4));

    }

    public static String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, Comparator.comparingInt(String::length)
                .thenComparing(Comparator.naturalOrder()));

        return nums[nums.length-k];
    }
}