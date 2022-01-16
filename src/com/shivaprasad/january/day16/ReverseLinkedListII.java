package com.shivaprasad.january.day16;

import com.shivaprasad.january.day15.PalindromeLinkedList;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/reverse-linked-list-ii/
public class ReverseLinkedListII {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || head.next == null)
            return head;

        ListNode dummyNode = new ListNode(-501);
        dummyNode.next = head;
        ListNode prevIt = null;
        ListNode it = dummyNode;

        for(int i=0;i<left;i++)
        {
            prevIt = it;
            it = it.next;
        }

        ListNode prevR = prevIt;
        ListNode itR = it;

        for(int i=left;i<=right;i++)
        {
            ListNode forward = itR.next;
            itR.next = prevR;
            prevR = itR;
            itR = forward;
        }

        prevIt.next = prevR;
        it.next = itR;

        return dummyNode.next;

        //T.C: O(n)
        //S.C: O(1)

    }

}
