package leetcode.y2024.m03.d05;

import leetcode.common.ListNode;

class Solution92M2 {
    //
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(-1,head),p0 =dummyNode;
        ListNode cur = p0.next;
        for (int i = 1; i < left ; i++) {
            p0 = p0.next;
            cur = cur.next;
        }
        //头插法
        for(int i = 0 ;i<right-left;i++){
            ListNode next = cur.next;
            cur.next = cur.next.next;
            next.next = p0.next;
            p0.next = next;
        }
        return dummyNode.next;
    }

}