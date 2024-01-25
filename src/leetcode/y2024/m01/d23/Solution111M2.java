package leetcode.y2024.m01.d23;

import leetcode.common.TreeNode;

public class Solution111M2 {


    public static void main(String[] args) {

        System.out.println(minDepth(
                TreeNode.getTreeNodeIns1()
        ));
    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        //有一个子数为空
        int res;
        if (left == 0 || right == 0) {
            res = left + right + 1;
        } else {
            res = Math.min(left, right) + 1;
        }
        return res;
    }


}