package leetcode.y2024.m02.d27;

import leetcode.common.ListNode;

/**
 * 递归解法
 */
class Solution206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = reverseList(head.next);

        head.next.next = head;

        head.next = null;

        return last;
    }
}