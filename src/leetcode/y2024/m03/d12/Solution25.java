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

        int n = 0;
        for (ListNode count = head; count != null; count = count.next ){
            n++;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head, p0 = dummy;

        for (int i = 0; i < n / k; i++) {
            for (int j = 1; j < k; j++) {
                ListNode next = cur.next;
                cur.next = cur.next.next;
                next.next = p0.next;
                p0.next = next;
            }
            p0 = cur;
            cur = cur.next;
        }

        return dummy.next;
    }


}