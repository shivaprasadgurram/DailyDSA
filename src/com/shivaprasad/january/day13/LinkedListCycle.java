package com.shivaprasad.january.day13;

import com.shivaprasad.january.day12.RotateList;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycle {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) { this.val = val; this.next = next; }
    }

    public boolean hasCycle(ListNode head) {
        if(head==null || head.next == null)
            return false;

        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr.next!=null && fastPtr.next.next!=null)
        {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(fastPtr == slowPtr)
                return true;
        }

        return false;
        //T.C: O(n)
        //S.C: O(1)

    }
}
