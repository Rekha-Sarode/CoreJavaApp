package com.snipe.learning.collections;

public class TestDoublyLinkedList {
    class Node
	{  
	    int data;  
	    Node previous;  
	    Node next;   
	    public Node(int data)
	    {  
	        this.data = data;  
	    }  
    }   

    Node head, tail = null;   

    public void insert(int data)
    {  
        Node newNode = new Node(data);   
        if(head == null) 
        {  
            head = tail = newNode;  
            head.previous = null;  
            tail.next = null;  
        }  
        else 
        {  
            tail.next = newNode;  
            newNode.previous = tail;  
            tail = newNode;  
            tail.next = null;  
	    }  
	}  

    public void displaylist() 
    {  
        Node current = head; 
        if(head == null) 
        {  
            System.out.println("The given list is empty");  
            return;  
        }  
        System.out.println("The data in the doubly linked list are: ");  
        while(current != null) 
        {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    } 

    public static void main(String[] args)
    {  
    	TestDoublyLinkedList newList = new TestDoublyLinkedList();  
        newList.insert(10);  
        newList.insert(30);  
        newList.insert(50);  
        newList.displaylist();  
    }  
}
