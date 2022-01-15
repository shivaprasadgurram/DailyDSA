package com.shivaprasad.january.day15;

import com.shivaprasad.january.day14.LinkedListCycleII;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public boolean isPalindrome(ListNode head) {

        if(head.next == null)
            return true;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow.next = reverse(slow.next);
        slow = slow.next;

        while(slow!=null)
        {
            if(slow.val != head.val)
                return false;
            slow = slow.next;
            head = head.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
