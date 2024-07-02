package leetcode.y2024.m06.d04;

class Solution1103m2 {
    public static void main(String[] args) {
        int[] ints = distributeCandies(10, 3);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static int[] distributeCandies(int candies, int num_people) {
        int m = (int) ((Math.sqrt(8.0 * candies + 1) - 1) / 2);
        int k = m / num_people;
        int extra = m % num_people;
        int[] ans = new int[num_people];
        for (int i = 0; i < num_people; i++) {
            ans[i] = k * (k - 1) / 2 * num_people + k * (i + 1) + (i < extra ? k * num_people + i + 1 : 0);
        }
        ans[extra] += candies - m * (m + 1) / 2;
        return ans;

    }
}