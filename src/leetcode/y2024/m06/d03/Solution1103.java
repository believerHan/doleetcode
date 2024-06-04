package leetcode.y2024.m06.d03;

import java.util.Arrays;

class Solution1103 {
    public static void main(String[] args) {
        int[] ints = distributeCandies(10, 3);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
    public static int[] distributeCandies(int candies, int num_people) {
        int[] cf = new int[num_people];
        int candi = 1;
        while (candies > 0) {
            for (int i = 0; i < cf.length; i++) {
                if ((candies -candi)<= 0){
                    cf[i] += candies;
                    candies = 0;
                    break;
                }
                cf[i] += candi;
                candies -= candi;
                candi++;
            }
        }
        return cf;
    }
}