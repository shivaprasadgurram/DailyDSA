package com.shivaprasad.january.day17;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/odd-even-linked-list/
public class OddEvenLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null)
            return head;

        ListNode dummyEvenNode = new ListNode(1000001);
        ListNode dummyOddNode = new ListNode(1000001);

        ListNode odd = dummyOddNode;
        ListNode even = dummyEvenNode;

        boolean oddPos = true;

        ListNode currNode = head;

        while(currNode!=null)
        {
            if(oddPos)
            {
                ListNode newNode = new ListNode(currNode.val);
                odd.next = newNode;
                odd = odd.next;
                oddPos = false;
            }
            else
            {
                ListNode newNode = new ListNode(currNode.val);
                even.next = newNode;
                even = even.next;
                oddPos = true;
            }
            currNode = currNode.next;
        }

        odd.next = dummyEvenNode.next;

        return dummyOddNode.next;

        //T.C: O(n)
        //S.C: O(1)
    }
}
