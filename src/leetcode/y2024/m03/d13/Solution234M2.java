package leetcode.y2024.m03.d13;

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
class Solution234M2 {
    static ListNode end;

    public static void main(String[] args) {
        ListNode l6 = new ListNode(1, null);
        ListNode l5 = new ListNode(2, l6);
        ListNode l4 = new ListNode(3, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        System.out.println(isPalindrome(l1));
    }

    public static boolean isPalindrome(ListNode head) {
        if (end == null) {
            end = head;
        }
        if (head == null) {
            return true;
        }
        Boolean flag = isPalindrome(head.next) && (head.val == end.val);
        end = end.next;
        return flag;
    }


}