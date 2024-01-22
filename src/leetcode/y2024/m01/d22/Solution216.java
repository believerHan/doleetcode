package leetcode.y2024.m01.d22;

import java.util.LinkedList;
import java.util.List;

/**
 * 找出所有相加之和为 n 的 k 个数的组合，且满足下列条件：
 * 只使用数字1到9
 * 每个数字 最多使用一次
 * 返回 所有可能的有效组合的列表 。该列表不能包含相同的组合两次，组合可以以任何顺序返回。
 */
class Solution216 {
   static List<List<Integer>> allPoss = new LinkedList<>();
   static LinkedList<Integer> repository = new LinkedList<>();

    public static void main(String[] args) {
        combinationSum3(3,13);
        System.out.println(allPoss);
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        calculationSum(k, n, 1, 0);
        return allPoss;
    }

    private static void calculationSum(int k, int sum, int start, int addSum) {
        if (repository.size() == k) {
            if (addSum == sum) {
                allPoss.add(new LinkedList<>(repository));
            }
        }
        for (int i = start; i <= 9; i++) {
            addSum = addSum + i ;
            if(addSum>sum){
                break;
            }
            repository.add( i );
            calculationSum( k , sum , i + 1, addSum);
            repository.removeLast();
            addSum = addSum - i;
        }
    }
}