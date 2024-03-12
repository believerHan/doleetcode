package leetcode.y2024.m03.d05;

import leetcode.common.ListNode;

class Solution92 {
    public static ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(0, head), p0 = dummy;
        for (int i = 0; i < left - 1; i++) {
            p0 = p0.next;
        }
        ListNode pre = null, cur = p0.next;
        for (int i = 0; i < right - left + 1; i++) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        p0.next.next = cur;
        p0.next = pre;
        return dummy.next;
    }

}