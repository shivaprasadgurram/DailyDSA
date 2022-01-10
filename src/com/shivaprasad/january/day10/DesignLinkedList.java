package com.shivaprasad.january.day10;

//Include only Node class code and methods(except main) in final submission.
//Problem:https://leetcode.com/problems/design-linked-list/
public class DesignLinkedList {
    class Node
    {
        int val;
        Node next;

        Node(int val)
        {
            this.val = val;
        }
    }

    Node dummyNode;
    int size;

    public DesignLinkedList() {

        dummyNode = new Node(-1);
        size = 0;

    }

    public int get(int index) {

        if(index >= size)
            return -1;

        Node currNode = dummyNode;

        for(int i=0;i<=index;i++)
        {
            currNode = currNode.next;
        }

        return currNode.val;
    }

    public void addAtHead(int val) {

        Node head = new Node(val);
        head.next = dummyNode.next;
        dummyNode.next = head;
        size++;
    }

    public void addAtTail(int val) {

        Node curr = dummyNode;
        Node tail = new Node(val);

        for(int i=0;i<size;i++)
        {
            curr = curr.next;
        }

        curr.next = tail;
        size++;

    }

    public void addAtIndex(int index, int val) {

        if(index > size)
            return;

        Node curr = dummyNode;
        Node newNode = new Node(val);

        for(int i=0;i<index;i++)
        {
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {

        if(index >= size)
            return;

        Node curr = dummyNode;

        for(int i=0;i<index;i++)
        {
            curr = curr.next;
        }

        curr.next = curr.next.next;
        size--;

    }
    //DON'T INCLUDE THIS IN MAIN SUBMISSION
    //Creating this method just for output tracking.
    public void display()
    {
        Node curr =dummyNode.next;
        while(curr!=null)
        {
            System.out.print(curr.val+"  ");
            curr = curr.next;
        }
    }


    //Creating this method only for testing. DON'T INCLUDE THIS IN FINAL SUBMISSION.
    public static void main(String[] args) {

        DesignLinkedList obj = new DesignLinkedList();

        System.out.print("get 1:  "+ obj.get(1));

        obj.addAtHead(5);
        System.out.println("\n\nLinked List after addAtHead");
        obj.display();

        obj.addAtTail(9);
        System.out.println("\n\nLinked List after addAtTail");
        obj.display();

        obj.addAtIndex(1,11);
        System.out.println("\n\nLinked List after addAtIndex");
        obj.display();

        obj.deleteAtIndex(1);
        System.out.println("\n\nLinked List after deleteAtIndex");
        obj.display();
    }
}
