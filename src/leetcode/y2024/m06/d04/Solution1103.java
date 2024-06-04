package leetcode.y2024.m06.d04;

import java.util.Arrays;

class Solution1103m2 {
    public static void main(String[] args) {
        int[] ints = distributeCandies(10, 3);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static int[] distributeCandies(int candies, int num_people) {
        int maxloop = 0;
        for (int i = 0; i < candies; i++) {
            if ((i * num_people * (num_people + 1) / 2) <= candies) {
                maxloop = i;
            }
        }
        int[] ac = new int[num_people];
        ac[0] = 0;
        for (int i = 1; i < ac.length; i++) {
            ac[i] = ac[i - 1] + maxloop;
        }
        candies -= (maxloop * num_people * (num_people + 1) / 2);
        if (candies == 0) {
            return ac;
        }


        return ac;
    }
}