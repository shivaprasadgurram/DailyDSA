package com.shivaprasad.datastructures;

public class LinkedListInsertAndDeleteOperations {
    static Node head;

    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }
    }

    public void display()
    {
        Node currNode = head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+"  ");
            currNode = currNode .next;
        }
    }

    public void insertAtBeginning(Node node)
    {
        if(head == null)
            head = node;
        else
        {
            node.next = head;
            head = node;
        }
    }

    public void insertAtEnd(Node node)
    {
        Node currNode = head;

        if(head == null)
            head = node;
        while(currNode.next!=null)
        {
            currNode = currNode.next;
        }

        currNode.next = node;
    }

    public void insertAtNthPosition(Node node,int position)
    {
        Node currNode = head;
        int length = 1;
        if(position<0 || position>size()) return;
        while(length<=position-1)
        {
            currNode = currNode.next;
            length++;
        }
        Node tempNode = currNode.next;
        currNode.next = node;
        node.next = tempNode;
    }

    public static int size()
    {
        int size = 1;

        if(head == null)
            return 0;
        Node currNode = head;
        while(currNode.next!=null)
        {
            size++;
            currNode = currNode.next;
        }
        return size;
    }

    public void insertNodeAfterNode(Node node,int val)
    {
        Node currNode = head;

        if(head == null)
            return;

        while(currNode.next!=null && currNode.data!=val)
        {
            currNode = currNode.next;
        }

        Node dummyNode = currNode.next;
        currNode.next = node;
        node.next = dummyNode;
    }

    public void deleteAtBeginning()
    {
        Node currNode = head;

        if(head == null)
            return;

        Node temp = head;
        head = head.next;
        temp =null;
    }

    public void deleteAtEnd()
    {
        if(head == null)
            return;

        Node currNode = head;

        while(currNode.next!= null && currNode.next.next!=null)
        {
            currNode = currNode.next;
        }

        currNode.next = null;

        /*  You can go with below code also

        Node dummyNode = new Node(-1);
        dummyNode.next = head;
        Node prev = dummyNode;
        Node currNode = head;
        while(currNode.next != null)
        {
            prev = currNode;
            currNode = currNode.next;
        }
        prev.next = current.next;
        */
    }

    public void deleteAtNthPosition(int position)
    {
        if( position< 0 || position>size())
        {
            return;
        }
        Node currNode = head;
        int length = 1;
        while(length<position)
        {
            currNode = currNode.next;
            length++;
        }
       currNode.next = currNode.next.next;

    }



    public static void main(String[] args) {

        int[] arr = {1,8,5,3,6,4,7};
        Node currNode = head;

        //Creation of LinkedList using Array Data
        for(int i=0;i<arr.length;i++)
        {
            int val = arr[i];
            Node node = new Node(val);
            if(head == null)
                head = node;
            else
                currNode.next = node;
            currNode = node;
        }

        LinkedListInsertAndDeleteOperations obj = new LinkedListInsertAndDeleteOperations();
        System.out.println("Original Linked List  "  + " Size:  "+obj.size());
        obj.display();

        Node n1 = new Node(9);
        obj.insertAtBeginning(n1);
        System.out.println("\n\nLinked List after : Insert At Beginning:  " + " Size:  "+obj.size());
        obj.display();

        Node n2 = new Node(11);
        obj.insertAtEnd(n2);
        System.out.println("\n\nLinked List after : Insert At End:  " + " Size:  "+obj.size());
        obj.display();

        Node n3 = new Node(56);
        obj.insertAtNthPosition(n3,3);
        System.out.println("\n\nLinked List after : Insert At Nth position:  " + " Size:  "+obj.size());
        obj.display();

        Node n4 = new Node(99);
        obj.insertNodeAfterNode(n4,3);
        System.out.println("\n\nLinked List after : Insert Node after Node:  " + " Size:  "+obj.size());
        obj.display();

        obj.deleteAtBeginning();
        System.out.println("\n\nLinked List after : Delete Node At Beginning:  " + " Size:  "+obj.size());
        obj.display();

        obj.deleteAtEnd();
        System.out.println("\n\nLinked List after : Delete Node At End:  " + " Size:  "+obj.size());
        obj.display();

        obj.deleteAtNthPosition(5);
        System.out.println("\n\nLinked List after : Delete Node At Nth Position:  " + " Size:  "+obj.size());
        obj.display();

    }

}