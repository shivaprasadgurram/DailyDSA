package com.shivaprasad.january.day12;


//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/rotate-list/
public class RotateList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k==0)return head;

        ListNode curr = head;
        int length = 1;

        while(curr.next!=null)
        {
            length++;
            curr =curr.next;
        }

        curr.next = head;

        k = length - (k % length);

        while(k-->0)
        {
            curr = curr.next;
        }

        head = curr.next;
        curr.next=null;

        return head;

        //T.C: O(n)
        //S.C: O(1)
    }

}
