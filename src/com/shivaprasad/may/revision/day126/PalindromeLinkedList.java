package com.shivaprasad.may.revision.day126;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class PalindromeLinkedList {

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
            if(head.val != slow.val)
                return false;

            head = head.next;
            slow = slow.next;
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
