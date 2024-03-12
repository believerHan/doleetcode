package leetcode.y2024.m03.d05;

import leetcode.common.ListNode;

class Solution92M3 {

    //递归解法
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        // 边界条件处理
        if (left == 1) {
            return reverseN(head, right);
        }
        // 递归反转左子链表的后续节点
        head.next = reverseBetween(head.next, left - 1, right - 1);
        return head;
    }
    // 反转链表的前 n 个节点
    static  ListNode successor = null; // 后继节点
    public static ListNode reverseN(ListNode head, int n) {
        // 边界条件处理
        if (n == 1) {
            successor = head.next;
            return head;
        }
        ListNode last = reverseN(head.next, n - 1);
        head.next.next = head;
        head.next = successor;
        return last;
    }
}