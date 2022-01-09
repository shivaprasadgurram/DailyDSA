package com.shivaprasad.january.day9;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {

    class ListNode
    {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    //Iterative Solution
    public ListNode reverseList(ListNode head) {

        if(head == null)
            return null;

        ListNode prevNode = null;

        while(head!=null)
        {
            ListNode temp = head.next;
            head.next = prevNode;
            prevNode = head;
            head = temp;
        }

        return prevNode;

        //T.C: O(n)
        //S.C: O(1)
    }

    //Recursive Solution
    /*public ListNode reverseList(ListNode head) {

        return reverseRecursivly(head,null);
    }


    public ListNode reverseRecursivly(ListNode head, ListNode prevNode)
    {
        if(head == null)
            return prevNode;

        ListNode temp = head.next;
        head.next = prevNode;
        return reverseRecursivly(temp,head);

        //T.C: O(n)
        //S.C: O(n)
    } */
}
