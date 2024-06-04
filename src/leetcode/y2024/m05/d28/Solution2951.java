package leetcode.y2024.m05.d28;

import java.util.ArrayList;
import java.util.List;

class Solution2951 {
    public static void main(String[] args) {
        findPeaks(new int[]{1,4,1});
    }

    public static List<Integer> findPeaks(int[] mountain) {
        if (mountain.length <= 2) {
            return new ArrayList<>();
        }
        int l = 1, r = mountain.length - 2;

        List<Integer> allIdex = new ArrayList<>();

        while (l <= r) {

            if (mountain[l - 1] < mountain[l] && mountain[l] > mountain[l + 1]) {
                allIdex.add(l);
                l += 2;
            } else {
                l++;
            }
            if (l != (r + 2) && mountain[r - 1] < mountain[r] && mountain[r] > mountain[r + 1]) {
                allIdex.add(r);
                r -= 2;
            } else {
                r--;
            }


        }
        return allIdex;
    }
}