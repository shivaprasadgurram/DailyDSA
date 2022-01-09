package com.shivaprasad.january.day9;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthNodeFromEndOfList {

    class ListNode
    {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode slow = dummyNode;
        ListNode fast = dummyNode;
        for(int i=1;i<=n;i++)
        {
            fast = fast.next;
        }
        while(fast.next!=null)
        {
            fast = fast.next;
            slow=slow.next;
        }
        slow.next = slow.next.next;
        return dummyNode.next;

        //T.C: O(n)
        //S.C: O(1)
    }
}
