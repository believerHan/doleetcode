package leetcode.y2024.m03.d20;

class Solution1011 {

    public static void main(String[] args) {
        // System.out.println(shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 1));
        System.out.println(shipWithinDays(new int[]{3, 2, 2, 4, 1, 4}, 3));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int count = 0;
        for (int weight : weights) {
            count += weight;
        }
        int min = count  / days;
        while (true) {
            int sta = min;
            int useday = days;
            int i = 0;
            for (; i < weights.length; i++) {
                sta -= weights[i];
                // 不够放或者刚刚好
                if (sta <= 0) {
                    //时间减一天
                    useday--;
                    if (sta < 0)
                        i--;
                    if (useday == 0) {
                        break;
                    }
                    sta = min;
                }
            }
            if (i >= weights.length - 1) {
                return min;
            }
            min++;
        }
    }
}