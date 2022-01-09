package com.shivaprasad.datastructures;

public class ConvertArrayToLinkedList {
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

    public static void main(String[] args) {

        int[] arr = {1,3,7,8,9};
        Node currNode = head;

        for(int i=0;i<arr.length;i++)
        {
            Node node = new Node(arr[i]);
            if(head == null)
            {
                head = node;
            }
            else
            {
                currNode.next = node;
            }
            currNode = node;
        }

        ConvertArrayToLinkedList obj = new ConvertArrayToLinkedList();
        obj.display();
    }
}
