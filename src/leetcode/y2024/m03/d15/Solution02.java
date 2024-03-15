package leetcode.y2024.m03.d15;

import leetcode.common.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int addone = 0;
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while (l1 != null || l2 != null) {
            int add1 = l1 == null ? 0 : l1.val;
            int add2 = l2 == null ? 0 : l2.val;
            head.next = new ListNode((add1 + add2 + addone) % 10);
            head = head.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            if ((add1 + add2 + addone) >= 10) {
                addone = 1;
            } else {
                addone = 0;
            }
        }
        if (addone == 1) {
            head.next = new ListNode(1);
        }
        return dummy.next;
    }
}