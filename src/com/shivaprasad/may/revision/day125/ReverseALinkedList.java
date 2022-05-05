package com.shivaprasad.may.revision.day125;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class ReverseALinkedList {

    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;
        ListNode currNode = head;
        ListNode prevNode = null;
        while(currNode!=null) {
            ListNode temp = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = temp;
        }
        return prevNode;
    }
}
