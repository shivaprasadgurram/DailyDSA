package com.shivaprasad.january.day16;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
public class SwappingNodesInALinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapNodes(ListNode head, int k) {

        if(head == null || head.next == null)
            return head;

        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        ListNode fast = dummyNode;
        ListNode slow = dummyNode;
        ListNode fastF = dummyNode;

        for(int i=1;i<=k;i++)
        {
            fast = fast.next;
        }

        for(int i=1;i<=k;i++)
        {
            fastF = fastF.next;
        }

        while(fastF.next!=null)
        {
            fastF= fastF.next;
            slow = slow.next;
        }

        int temp = slow.next.val;
        slow.next.val = fast.val;
        fast.val = temp;

        return dummyNode.next;

        //T.C: O(n)
        //S.C: O(1)
    }

}
