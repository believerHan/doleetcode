package leetcode.common;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode getTreeNodeIns1() {
        //   2
        //    \
        //     3
        //      \
        //       4
        //        \
        //         5
        //          \
        //           6
        //[2,null,3,null,4,null,5,null,6]
        TreeNode treeNode6 = new TreeNode(6, null, null);
        TreeNode treeNode5 = new TreeNode(5, null, treeNode6);
        TreeNode treeNode4 = new TreeNode(4, null, treeNode5);
        TreeNode treeNode3 = new TreeNode(3, null, treeNode4);
        TreeNode treeNode = new TreeNode(2, null, treeNode3);
        return  treeNode ;
    }


    public static TreeNode getTreeNodeIns2() {
        //        1
        //       /  \
        //      2    3
        //     / \  /  \
        //    4  5  6  7
        //         / \
        //        8   9
        //       /
        //      10
        //[1 2 3 4 5 6 7 N N N N 8 9 N N 10 N N N N N]
        TreeNode treeNode10 = new TreeNode(10, null, null);
        TreeNode treeNode9 = new TreeNode(9, null, null);
        TreeNode treeNode8 = new TreeNode(8, treeNode10, null);
        TreeNode treeNode7 = new TreeNode(7, null, null);
        TreeNode treeNode6 = new TreeNode(6, treeNode8, treeNode9);
        TreeNode treeNode5 = new TreeNode(5, null, null);
        TreeNode treeNode4 = new TreeNode(4, null, null);
        TreeNode treeNode3 = new TreeNode(3, treeNode6, treeNode7);
        TreeNode treeNode2 = new TreeNode(2, treeNode4, treeNode5);
        TreeNode treeNode1 = new TreeNode(1, treeNode3, treeNode2);

        return  treeNode1 ;
    }


    public static TreeNode getTreeNodeIns3() {
        //         1
        //       /   \
        //      2     3
        //     /     /   \
        //    4     5     6
        //     \   /     / \
        //      7 8     9   10
        //     /       /
        //    11      12
        //   /  \
        //  13  14
        //      / \
        //     15  16
        //[1 2 3 4 5 6 7 N N N N 8 9 N N 10 N N N N N]
        TreeNode treeNode16 = new TreeNode(16, null, null);
        TreeNode treeNode15 = new TreeNode(15, null, null);
        TreeNode treeNode14 = new TreeNode(14, treeNode15, treeNode16);
        TreeNode treeNode13 = new TreeNode(13, null, null);
        TreeNode treeNode12 = new TreeNode(12, null, null);
        TreeNode treeNode11 = new TreeNode(11, treeNode13, treeNode14);
        TreeNode treeNode10 = new TreeNode(10, null, null);
        TreeNode treeNode9 = new TreeNode(9, treeNode12, null);
        TreeNode treeNode8 = new TreeNode(8, null, null);
        TreeNode treeNode7 = new TreeNode(7, treeNode11, null);
        TreeNode treeNode6 = new TreeNode(6, treeNode9, treeNode10);
        TreeNode treeNode5 = new TreeNode(5, treeNode8, null);
        TreeNode treeNode4 = new TreeNode(4, null, treeNode7);
        TreeNode treeNode3 = new TreeNode(3, treeNode5, null);
        TreeNode treeNode2 = new TreeNode(2, treeNode4, null);
        TreeNode treeNode1 = new TreeNode(1, treeNode3, treeNode2);

        return  treeNode1 ;
    }
}