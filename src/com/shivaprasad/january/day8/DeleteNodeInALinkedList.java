package com.shivaprasad.january.day8;


//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
// and we don't need to worry about it.
//Problem: https://leetcode.com/problems/delete-node-in-a-linked-list/
public class DeleteNodeInALinkedList {

   class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
