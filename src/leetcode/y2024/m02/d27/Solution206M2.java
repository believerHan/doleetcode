package leetcode.y2024.m02.d27;

import leetcode.common.ListNode;

/**
 * 迭代解法
 */
class Solution206M2 {

    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

}