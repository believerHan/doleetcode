package leetcode.y2024.m02.d06;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class Solution30 {

    public static void main(String[] args) {
        System.out.println(magicTower(new int[]{5, -4, 1, -2, -2, -2, 4}));
        // System.out.println(magicTower(new int[]{-200, -300, 400, 0}));
    }

    public static int magicTower(int[] nums) {
        //
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long sum = 1;
        int count = 0;
        long delay = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                pq.offer(nums[i]);
            }
            sum += nums[i];
            if (sum <= 0) {
                count++;
                Integer poll = pq.poll();
                delay += poll;
                sum -= poll;
            }
        }
        if (sum + delay <= 0) {
            count = -1;
        }
        return count;
    }
}