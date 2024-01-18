package leetcode.y2024.m01.d18;

import java.util.LinkedList;
import java.util.List;

class Solution {
    List<List<Integer>> allPossible = new LinkedList<>();

    /**
     *
     * @param k  个数
     * @param n  总和
     * @return
     */
    public List<List<Integer>> combinationSum3(int k, int n) {

        LinkedList<Integer> num = new LinkedList<>();
        comNum(k,n,num);
        return allPossible;
    }

    private void comNum(int k, int n, LinkedList<Integer> num) {
      //  if(num.size())

    }
}