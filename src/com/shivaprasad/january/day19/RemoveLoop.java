package com.shivaprasad.january.day19;

//GeeksForGeeks: https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/
public class RemoveLoop {

    class Node
    {
        int data;
        Node next;
    }

    public static void removeLoop(Node head){

        if(head == null)
            return;

        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }

        if(fast == null || fast.next ==null) return;

        slow = head;

        while(slow!=fast)
        {
            slow = slow.next;
            fast = fast.next;
        }

        while(slow!=fast.next)
        {
            fast = fast.next;
        }

        fast.next = null;

        //T.C: O(n)
        //S.C: O(1)
    }
}
