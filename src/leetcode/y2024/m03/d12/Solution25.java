package leetcode.y2024.m03.d12;

import leetcode.common.ListNode;

import java.security.Key;

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
class Solution25 {


    public static void main(String[] args) {

        ListNode l6 = new ListNode(6, null);
        ListNode l5 = new ListNode(5, l6);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        ListNode listNode = reverseKGroup(l1, 3);
        System.out.println(listNode);

    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode end = head;
        for (int i = 1; i < k; i++) {
            end = end.next;
            if (end == null) {
                return head;
            }
        }
        ListNode endNext = end.next;
        ListNode reverse = reverse(head, end);

        ListNode listNode = reverseKGroup(endNext, k);
        head.next = listNode;

        return reverse;
    }

    public static ListNode reverse(ListNode head, ListNode end) {

        ListNode cur = head;
        ListNode pre = null;
        while (pre != end) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return end;
    }
}