package com.shivaprasad.january.day14;

import com.shivaprasad.january.day13.LinkedListCycle;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/linked-list-cycle-ii/
public class LinkedListCycleII {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode detectCycle(ListNode head) {

        if(head == null || head.next == null)
            return null;


        ListNode fast = head;
        ListNode slow = head;

        while(fast.next!=null && fast.next.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
            {
                slow = head;
                while(slow!=fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        return null;

        //T.C: O(n+k) i.e, O(n)
        //S.C: O(1)
    }
}
