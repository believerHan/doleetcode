package leetcode.y2024.m04.d19;

class Solution1883 {
    public static void main(String[] args) {

    }

    public static int minSkips(int[] dist, int speed, int hoursBefore) {
        double[] dif = new double[dist.length - 1];
        double sumTime = 0;
        for (int i = 0; i < dist.length - 1; i++) {
            sumTime += (double) dist[i] / speed;
            dif[i] = (double) dist[i] % 1;
        }

        return 0;
    }
}