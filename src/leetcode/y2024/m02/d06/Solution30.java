package leetcode.y2024.m02.d06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution30 {

    public static void main(String[] args) {
        System.out.println(magicTower(new int[]{100, 100, 100, -250, -60, -140, -50, -50, 100, 150}));
         System.out.println(magicTower(new int[]{-200, -300, 400, 0}));
    }

    public static int magicTower(int[] nums) {
        int rebackNum = 0;

        //栈 维护已经打死的怪物,也是回血包
        Stack<Integer> deadM = new Stack<>();
        //队列 避开的怪物.
        Queue<Integer> queueM = new LinkedList<>();
        int sum = 1;
        for (int num : nums) {
            if (num >= 0) {
                //回血
                sum += num;
            } else {
                //先打怪物
                sum += num;
                if (sum <= 0) {
                    // 打不赢，先不打，撤销攻击
                    sum -= num;
                    int cursum = sum ;
                    // 回之前打怪的血,直到可以打赢怪物，或者没有血包
                    while (deadM.size() > 0) {
                        Integer pop = deadM.pop();
                        sum -= pop;
                        queueM.add(pop);
                        rebackNum++;
                        //再次尝试打怪
                        sum += num;
                        if (sum > 0) {
                            //打赢
                            deadM.add(num);
                            break;
                        } else {
                            sum -= num;
                        }
                    }
                    if (sum == cursum) {
                        //先避开
                        queueM.add(num);
                    }
                } else {
                    // 打死怪物
                    deadM.add(num);
                }
            }

        }
        for (Integer inte : queueM) {
            sum += inte;
        }

        if (sum <= 0) {
            return -1;
        }
        return rebackNum;
    }
}