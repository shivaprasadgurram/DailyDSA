package com.shivaprasad.january.day23;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {

    public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public  ListNode reverseList(ListNode head) {
        return reverseRecursive(head,null);
    }

    public ListNode reverseRecursive(ListNode head,ListNode prev)
    {
        if(head == null) return prev;

        ListNode next = head.next;
        head.next = prev;
        prev= head;
        return reverseRecursive(next,prev);
    }

    //T.C: O(n)
    //S.C: O(n)
}
