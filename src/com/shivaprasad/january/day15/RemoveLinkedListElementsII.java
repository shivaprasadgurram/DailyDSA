package com.shivaprasad.january.day15;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/remove-linked-list-elements/
public class RemoveLinkedListElementsII {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        if(head==null) return null;

        while(current.next!=null){
            if(current.next.val==val) current.next=current.next.next;
            else current = current.next;
        }
        if(head.val==val)return head.next;
        return head;

    }
}
