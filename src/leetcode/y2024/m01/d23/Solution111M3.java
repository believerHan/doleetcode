package leetcode.y2024.m01.d23;

import leetcode.common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution111M3 {


    public static void main(String[] args) {

        System.out.println(minDepth(
                TreeNode.getTreeNodeIns3()
        ));
    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //存储当前同一层的节点
        LinkedList<TreeNode> levelTreeSto = new LinkedList<>();
        //初始节点
        levelTreeSto.add(root);
        int level = 1;
        //最差需要遍历完整个树
        while (!levelTreeSto.isEmpty()) {
            int size = levelTreeSto.size();
            //遍历当前层次的所有节点
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = levelTreeSto.removeFirst();
                //从上往下一层层,当有一个节点的左右子节点都是null的时候，就是最小的深度。
                if (treeNode.right == null && treeNode.left == null) {
                    return level;
                }
                //存入下一个层次的所有节点
                if (treeNode.left != null) {
                    levelTreeSto.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    levelTreeSto.add(treeNode.right);
                }
            }
            //遍历完一个层次深度加1
            level++;
        }
        return level;
    }

}