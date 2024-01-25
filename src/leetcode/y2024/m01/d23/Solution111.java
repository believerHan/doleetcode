package leetcode.y2024.m01.d23;

import leetcode.common.TreeNode;

public class Solution111 {
    static int depth = 0;

    public static void main(String[] args) {
        System.out.println(minDepth(TreeNode.getTreeNodeIns2()));
    }
    public static int minDepth(TreeNode root) {

        return bfs(root,0);
    }

    public static int bfs(TreeNode root, int curDepth) {
        if (root == null) {
            return curDepth;
        }
        int left = bfs(root.left, curDepth + 1);
        int right = bfs(root.right, curDepth + 1);
        if (left == curDepth + 1) {
            return right;
        }
        if (right == curDepth + 1) {
            return left;
        }

        return Math.min(left, right);
    }


}