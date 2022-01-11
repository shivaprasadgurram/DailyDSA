package com.shivaprasad.january.day11;

public class DeleteTheMiddleNodeOfALinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteMiddle(ListNode head) {

        ListNode dummyNode = new ListNode(-1,head);
        ListNode fast = dummyNode, slow = dummyNode;


        while(fast.next!=null && fast.next.next!=null)
        {
            fast= fast.next.next;
            slow = slow.next;
        }

        slow.next= slow.next.next;

        return dummyNode.next;

        //T.C: O(n)
        //S.C: O(1)
    }
}
