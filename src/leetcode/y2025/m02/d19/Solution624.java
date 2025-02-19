package leetcode.y2025.m02.d19;

import java.util.ArrayList;
import java.util.List;

class Solution624 {

    public static void main(String[] args) {

        ArrayList<List<Integer>> integers = new ArrayList<>();
        ArrayList<Integer> integer1 = new ArrayList<>();
        ArrayList<Integer> integer2 = new ArrayList<>();
        ArrayList<Integer> integer3 = new ArrayList<>();
        integer1.add(1);
     //   integer1.add(5);
        integer2.add(1);
   //     integer2.add(4);
  //      integer3.add(4);
        integers.add(integer1);
        integers.add(integer2);
  //      integers.add(integer3);
        System.out.println(maxDistance(integers));
    }

    public static int maxDistance(List<List<Integer>> arrays) {
        int ans = 0;
        int min = arrays.get(0).get(arrays.get(0).size()-1);
        int max = arrays.get(0).get(0);
        for (List<Integer> a : arrays) {
            int left = a.get(0);
            int right = a.get(a.size() - 1);
            ans = Math.max(ans, Math.max(right - min, max - left));
            min = Math.min(min, left);
            max = Math.max(max, right);
        }
        return ans;

    }
}